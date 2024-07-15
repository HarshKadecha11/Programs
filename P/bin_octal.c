#include <stdio.h>
#include <string.h>
#include <math.h>

void bintodec_triplets(char* n) {
    int len = strlen(n);
    // Ensure the binary string length is a multiple of 3
    if (len % 3 != 0) {
        printf("The binary string should be a multiple of 3 in length.\n");
        return;
    }

    for (int i = 0; i < len; i += 3) {
        int num = 0;
        // Convert each triplet to decimal
        for (int j = 0; j < 3; j++) {
            if (n[i + j] == '1') {
                num += pow(2, 2 - j); // 2 - j because we're dealing with triplets
            }
        }
        printf("Decimal of %c%c%c is: %d\n", n[i], n[i+1], n[i+2], num);
    }
}

int main() {
    char binaryString[] = "110101011";
    bintodec_triplets(binaryString);
    return 0;
}