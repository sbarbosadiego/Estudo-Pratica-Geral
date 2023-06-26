#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void main(){
    int num;
    float med;
    char nome[10];
    char nome2[10]; // Tambem pode ser usado um fflush(stdin) antes da entrada da entrada de vari�vel char, para ser limpado o buffer
    setlocale(LC_ALL,"Portuguese");
    printf("Digite seu nome: ");
    gets(nome);
    printf("Digite seu sobrenome: ");
    gets(nome2);
    printf("Digite um n�mero inteiro: \a");
    scanf("%d",&num);
    printf("Digite um n�mero real: \a");
    scanf("%f",&med);
    printf("Seu nome �: %s %s\nO n�mero inteiro digitado foi: %d e o n�mero real foi: %.2f \n",nome,nome2,num,med);
    system("pause");
}
