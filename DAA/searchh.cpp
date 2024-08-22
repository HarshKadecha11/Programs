#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int linearSearch(int arr[], int n, int x) {
    for (int i = 0; i < n; ++i) {
        if (arr[i] == x)
            return i;
    }
    return -1;
}
int main() {
    clock_t start, end;
    int n, key;
    cout << "Enter the number of elements: ";
    cin >> n;
    int *arr = new int[n];

    for (int i = 0; i < n; ++i) {
        arr[i] = i;
    }
    key = arr[0];
    start = clock();
    linearSearch(arr, n, key);
    end = clock();
    cout << "Best Case Time: " << double(end - start) / CLOCKS_PER_SEC * 1e6 << " microseconds" << endl;
    key = -1;
    start = clock();
    linearSearch(arr, n, key);
    end = clock();
    cout << "Worst Case Time: " << double(end - start) / CLOCKS_PER_SEC * 1e6 << " microseconds" << endl;
    srand(time(0));
    key = arr[rand() % n];
    start = clock();
    linearSearch(arr, n, key);
    end = clock();
    cout << "Average Case Time: " << double(end - start) / CLOCKS_PER_SEC * 1e6 << " microseconds" << endl;
 delete[] arr;
    return 0;
}