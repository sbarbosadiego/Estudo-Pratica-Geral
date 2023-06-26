#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void main(){
    char cabec[]="-------------------------------";
    char sexo1[2],sexo2[2],sexo3[2],nome1[10],nome2[10],nome3[10];
    float nota1,nota2,nota3;

    setlocale(LC_ALL,"Portuguese");
    printf("Cadastrando a Primeira Pessoa:\n%s",cabec);
    printf("\nNOME: ");
    fflush(stdin);
    gets(nome1);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%c",sexo1);
    printf("NOTA: ");
    fflush(stdin);
    scanf("%f",&nota1);
    printf("\nCadastrando a Segunda Pessoa:\n%s",cabec);
    printf("\nNOME: ");
    fflush(stdin);
    gets(nome2);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%c",sexo2);
    printf("NOTA: ");
    fflush(stdin);
    scanf("%f",&nota2);
    printf("\nCadastrando a Terceira Pessoa:\n%s",cabec);
    printf("\nNOME: ");
    fflush(stdin);
    gets(nome3);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%c",sexo3);
    printf("NOTA: ");
    fflush(stdin);
    scanf("%f",&nota3);
    printf("\nListagem Completa\n%s",cabec);
    printf("\nNOME\t\tSEXO\tNOTA");
    printf("\n%s\t\t%s\t%.1f",nome1,sexo1,nota1);
    printf("\n%s\t\t%s\t%.1f",nome2,sexo2,nota2);
    printf("\n%s\t\t%s\t%.1f\n",nome3,sexo3,nota3);
    system("pause");
}
