#include <stdio.h>
#include<stdlib.h>
#include<time.h>

int main() {
    int size;
    printf("Enter the Size of array: ");
    scanf("%d", &size);
    int arr[size];
    for (int i = 0; i < size; i++) {
        arr[i] = random() % size;
    } 
    clock_t start, end;
    double time_used;
    
    start = clock() ; 
    int i, key, j;

    for (i = 1; i < size; i++) {
        key = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    end = clock() ; 

    time_used = ((double)(end - start) ) / CLOCKS_PER_SEC;
    printf("\nTime taken: %f seconds\n", time_used);

    /*for (i = 0; i < size; i++)
        printf("%d ", arr[i]); */
    printf("\n");

    return 0;
}
