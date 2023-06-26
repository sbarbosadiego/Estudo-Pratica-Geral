#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

int main (){
    srand(time(NULL));
    int n1, n = rand() % 5;

    setlocale(LC_ALL,"Portuguese");
    printf("Vou pensar em número entre 1 a 5, tente adivinhar\n");
    printf("Digite seu palpite: ");
    scanf("%d",&n1);
    printf("Eu pensei no número %d e você pensou no %d\n",n,n1);
    if (n1 == n )
    {
        printf("Você acertou\n");
    }
    else if (n1 != n )
    {
        printf("Você errou\n");
    }
    return 0;
}
