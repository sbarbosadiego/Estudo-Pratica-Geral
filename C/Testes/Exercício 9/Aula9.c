#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

int main() {
    setlocale(LC_ALL,"Portuguese");
    srand(time(NULL));
    int n = rand() % 11 ;
    printf("Gerado o número (%d)",n);
    return 0;
}
