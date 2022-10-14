#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {
    char * word = argv[1];
    int length = strlen(word);
    char decodedword[length+1];

    for (int i = 0; i < length; i++) {
        if ((word[i] >= 'A' && word[i] <= 'M') || (word[i] >= 'a' && word[i] <= 'm')) {
            decodedword[i] = word[i] + 13;
        }
        else if ((word[i] >= 'N' && word[i] <= 'Z') || (word[i] >= 'n' && word[i] <= 'z')) {
            decodedword[i] = word[i] - 13;
        }
        else {
            decodedword[i] = word[i];
        }
    }

    decodedword[length] = '\n';
    printf("%s", decodedword);
}