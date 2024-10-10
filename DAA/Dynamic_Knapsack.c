#include <stdio.h>

// Function to find the maximum of two integers
int max(int a, int b) {
    return (a > b) ? a : b;
}

// Function to solve the 0/1 Knapsack problem using Dynamic Programming with Backtracking
int knapsack(int values[], int weights[], int n, int capacity) {
    int i, w;
    int K[n + 1][capacity + 1];

    // Build table K[][] in bottom-up manner
    for (i = 0; i <= n; i++) {
        for (w = 0; w <= capacity; w++) {
            if (i == 0 || w == 0) {
                K[i][w] = 0;
            } else if (weights[i - 1] <= w) {
                K[i][w] = max(values[i - 1] + K[i - 1][w - weights[i - 1]], K[i - 1][w]);
            } else {
                K[i][w] = K[i - 1][w];
            }
        }
    }

    // Print the knapsack table
    printf("Knapsack Table:\n");
    printf("    ");
    for (w = 0; w <= capacity; w++) {
        printf("%4d ", w);
    }
    printf("\n");

    for (i = 0; i <= n; i++) {
        printf("%4d ", i);
        for (w = 0; w <= capacity; w++) {
            printf("%4d ", K[i][w]);
        }
        printf("\n");
    }

    
    int res = K[n][capacity];
    printf("Maximum value in Knapsack = %d\n", res);
    printf("Items included:\n");

    w = capacity;
    for (i = n; i > 0 && res > 0; i--) {
        
        if (res != K[i - 1][w]) {
            printf("Item %d (Value: %d, Weight: %d)\n", i, values[i - 1], weights[i - 1]);
            
            res -= values[i - 1];
            w -= weights[i - 1];
        }
    }

    return K[n][capacity];
}

int main() {
    int n, capacity;
    printf("Enter the number of items: ");
    scanf("%d", &n);

    int values[n];
    int weights[n];

    // Accept the values and weights of the items from the user
    for (int i = 0; i < n; i++) {
        printf("Enter value and weight for item %d: ", i + 1);
        scanf("%d %d", &values[i], &weights[i]);
    }

    // Accept the capacity of the knapsack from the user
    printf("Enter the capacity of the knapsack: ");
    scanf("%d", &capacity);

    knapsack(values, weights, n, capacity);
    return 0;
}