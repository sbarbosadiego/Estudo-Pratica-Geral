#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    char cabec[] = "\n-------------------------------\n";
    char sexo1[1],sexo2[1],sexo3[1],nome1[10],nome2[10],nome3[10];
    float nota1,nota2,nota3;

    setlocale(LC_ALL,"Portuguese");
    printf("Cadastrando a primeira pessoa:%s",cabec);
    printf("NOME: ");
    fflush(stdin);
    scanf("%s",&nome1);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%s",&sexo1);
    printf("NOTA: ");
    scanf("%f",&nota1);
    printf("Cadastrando a segunda pessoa:%s",cabec);
    printf("\nNOME: ");
    fflush(stdin);
    scanf("%s",&nome2);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%s",&sexo2);
    printf("NOTA: ");
    scanf("%f",&nota2);
    printf("Cadastrando a terceira pessoa:%s",cabec);
    printf("\nNOME: ");
    fflush(stdin);
    scanf("%s",&nome3);
    printf("SEXO [M/F]: ");
    fflush(stdin);
    scanf("%s",&sexo3);
    printf("NOTA: ");
    scanf("%f",&nota3);
    printf("\nListagem Completa");
    printf("\nNOME:%s",nome1);
    return 0;
}
