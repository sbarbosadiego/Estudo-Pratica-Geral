#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
void main(){
    setlocale(LC_ALL,"Portuguese");
    unsigned int idade = 23;
    float peso = 79.0;
    char sexo = 'M';
    char nome[10] = "Diego";
    printf("Meu nome � %s, tenho %i anos de idade, peso %.2fKg e meu sexo � %c\n\a",nome,idade,peso,sexo);
    // Pode ser utilizado %i de int para exibir um n�mero inteiro
    system("pause");
}
