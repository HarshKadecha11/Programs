#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int size;
    printf("Enter the number of random numbers to generate: ");
    scanf("%d", &size);

    // Allocate memory for the array of random numbers
    int *random_numbers = (int *)malloc(size * sizeof(int));
    if (random_numbers == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Seed the random number generator
    srand(time(0));

    // Generate random numbers and store them in the array
    for (int i = 0; i < size; i++) {
        random_numbers[i] = rand() % 100; // Generate random numbers between 0 and 99
    }

    // Open the file for writing
    FILE *file = fopen("random_numbers.txt", "w");
    if (file == NULL) {
        printf("Error opening file\n");
        free(random_numbers);
        return 1;
    }

    // Write the random numbers to the file
    for (int i = 0; i < size; i++) {
        fprintf(file, "%d\n", random_numbers[i]);
    }

    // Close the file
    fclose(file);

    printf("%d random numbers have been written to random_numbers.txt\n", size);

    // Free the allocated memory
    free(random_numbers);

    return 0;
}