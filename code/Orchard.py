include <stdio.h>
#include <string.h>

int isValidRow(char *row) {
    int len = strlen(row);
    if (len < 3) {
        return 0;
    }

    for (int i = 1; i < len - 1; i++) {
        if (row[i] == row[i - 1] || row[i] == row[i + 1]) {
            return 0;
        }
    }

    return 1;
}

int countPossibilities(char *row) {
    int len = strlen(row);
    if (!isValidRow(row)) {
        return 0;
    }

    int count = 0;
    for (int i = 0; i < len - 2; i++) {
        for (int j = i + 2; j < len; j++) {
            for (int k = i + 1; k < j; k++) {
                if (row[i] != row[j] && row[i] != row[k] && row[j] != row[k]) {
                    count++;
                }
            }
        }
    }

    return count;
}

char *findWinner(char *ashokRow, char *anandRow) {
    if (!isValidRow(ashokRow) || !isValidRow(anandRow)) {
        return "Invalid input";
    }

    int ashokPossibilities = countPossibilities(ashokRow);
    int anandPossibilities = countPossibilities(anandRow);

    if (ashokPossibilities > anandPossibilities) {
        return "Ashok";
    } else if (anandPossibilities > ashokPossibilities) {
        return "Anand";
    } else {
        return "Draw";
    }
}

int main() {
    char ashokRow[10001];
    char anandRow[10001];

    printf("Enter Ashok's row: ");
    scanf("%10000s", ashokRow);

    printf("Enter Anand's row: ");
    scanf("%10000s", anandRow);

    char *winner = findWinner(ashokRow, anandRow);
    printf("Winner: %s\n", winner);

    return 0;
}