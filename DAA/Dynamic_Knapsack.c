#include <stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int knapsack(int values[], int weights[], int n, int capacity) {
    int i, w;
    int K[n + 1][capacity + 1];

    // Initialize the table
    for (i = 0; i <= n; i++) {
        for (w = 0; w <= capacity; w++) {
            if (i == 0 || w == 0)
                K[i][w] = 0;
            else if (weights[i - 1] <= w)
                K[i][w] = max(values[i - 1] + K[i - 1][w - weights[i - 1]], K[i - 1][w]);
            else
                K[i][w] = K[i - 1][w];
        }
    }

    // Print the table
    printf("Table:\n");
    printf("  +");
    for (w = 0; w <= capacity; w++) {
        printf("-----");
    }
    printf("+\n");
    printf("  |");
    for (w = 0; w <= capacity; w++) {
        printf("  %2d  ", w);
    }
    printf("|\n");
    printf("  +");
    for (w = 0; w <= capacity; w++) {
        printf("-----");
    }
    printf("+\n");

    for (i = 0; i <= n; i++) {
        printf("%2d |", i);
        for (w = 0; w <= capacity; w++) {
            printf("  %2d  ", K[i][w]);
        }
        printf("|\n");
        if (i < n) {
            printf("  +");
            for (w = 0; w <= capacity; w++) {
                printf("-----");
            }
            printf("+\n");
        }
    }

    printf("  +");
    for (w = 0; w <= capacity; w++) {
        printf("-----");
    }
    printf("+\n");

    return K[n][capacity];
}

int main() {
    int n, capacity;
    printf("Enter the number of items: ");
    scanf("%d", &n);

    int values[n];
    int weights[n];

    printf("Enter the values of the items: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &values[i]);
    }

    printf("Enter the weights of the items: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &weights[i]);
    }

    printf("Enter the capacity of the knapsack: ");
    scanf("%d", &capacity);

    printf("Maximum value: %d\n", knapsack(values, weights, n, capacity));

    return 0;
}