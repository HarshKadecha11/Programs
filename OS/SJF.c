#include <stdio.h>

typedef struct {
    int id;
    int burstTime;
    int waitingTime;
    int turnaroundTime;
} Process;

void sortProcessesByBurstTime(Process[], int);
void calculateWaitingTime(Process[], int);
void calculateTurnaroundTime(Process[], int);

int main() {
    int n, i;
    float totalWaitingTime = 0, totalTurnaroundTime = 0;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    Process processes[n];

    for (i = 0; i < n; i++) {
        processes[i].id = i + 1;
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burstTime);
    }

    sortProcessesByBurstTime(processes, n);
    calculateWaitingTime(processes, n);
    calculateTurnaroundTime(processes, n);

    printf("\nProcess ID\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\n", processes[i].id, processes[i].burstTime, processes[i].waitingTime, processes[i].turnaroundTime);
        totalWaitingTime += processes[i].waitingTime;
        totalTurnaroundTime += processes[i].turnaroundTime;
    }

    printf("\nAverage waiting time = %.2f", totalWaitingTime / n);
    printf("\nAverage turnaround time = %.2f\n", totalTurnaroundTime / n);

    return 0;
}

void sortProcessesByBurstTime(Process p[], int n) {
    int i, j;
    Process temp;

    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (p[j].burstTime > p[j + 1].burstTime) {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void calculateWaitingTime(Process p[], int n) {
    int i;
    p[0].waitingTime = 0;

    for (i = 1; i < n; i++) {
        p[i].waitingTime = p[i - 1].waitingTime + p[i - 1].burstTime;
    }
}

void calculateTurnaroundTime(Process p[], int n) {
    int i;

    for (i = 0; i < n; i++) {
        p[i].turnaroundTime = p[i].waitingTime + p[i].burstTime;
    }
}