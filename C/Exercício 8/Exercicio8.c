#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void main(){

    char nome[20];
    float peso,altura;
    unsigned int anoa, anon, idade;

    setlocale(LC_ALL,"Portuguese");
    printf("Qual o ano atual? ");
    scanf("%d",&anoa);
    printf("Digite seu nome: ");
    fflush(stdin);
    gets(nome);
    printf("Em que ano voce nasceu? ");
    scanf("%d",&anon);
    idade = anoa - anon;
    printf("Quanto voce pesa? ");
    scanf("%f",&peso);
    printf("Qual a sua altura? ");
    scanf("%f",&altura);
    printf("\aOla %s, voce tem %d anos de idade, ", nome, idade);
    if(idade>=18)
    {
        printf("Maior idade\n");
    }
    else if(idade<18)
    {
        printf("Menor Idade\n ");
    }
    system("pause");
}
