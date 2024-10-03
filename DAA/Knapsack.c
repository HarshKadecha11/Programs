#include <stdio.h>
void sortItemsByRatio(int weights[], int values[], int n) {
    double ratios[100]; 
    for (int i = 0; i < n; i++) {
        ratios[i] = (double)values[i] / weights[i];
    }
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (ratios[i] < ratios[j]) {
                
                double tempRatio = ratios[i];
                ratios[i] = ratios[j];
                ratios[j] = tempRatio;

                int tempWeight = weights[i];
                weights[i] = weights[j];
                weights[j] = tempWeight;

                int tempValue = values[i];
                values[i] = values[j];
                values[j] = tempValue;
            }
        }
    }
}

double fractionalKnapsack(int W, int weights[], int values[], int n) {
    sortItemsByRatio(weights, values, n); 

    double totalValue = 0.0;  

    for (int i = 0; i < n; i++) {
        if (W == 0) {
            break;  
        }

        if (weights[i] <= W) {
            W -= weights[i];
            totalValue += values[i];
        } else {
            double fraction = (double)W / weights[i];
            totalValue += values[i] * fraction;
            W = 0;  // Knapsack is now full
        }
    }
return totalValue;
}

int main() {
    int n, W;
    printf("Enter the number of items: ");
    scanf("%d", &n);

    int weights[100], values[100]; 
    printf("Enter the weight and value of each item:\n");
    for (int i = 0; i < n; i++) {
        printf("Item %d - Weight: ", i + 1);
        scanf("%d", &weights[i]);
        printf("Item %d - Value: ", i + 1);
        scanf("%d", &values[i]);
    }
    printf("Enter the maximum weight capacity of the knapsack: ");
    scanf("%d", &W);

    double maxValue = fractionalKnapsack(W, weights, values, n);

    printf("Maximum value that can be obtained in the knapsack: %.2f\n", maxValue);

    return 0;
}
