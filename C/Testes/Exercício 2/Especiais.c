#include <stdio.h>
#include <stdlib.h>
#include <locale.h> // Biblioteca para importa��o de codifica��o de caracteres
void main(){
    setlocale(LC_ALL,"Portuguese"); // Formata��o para codificar os caracteres
    printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    printf("\n\a\\a\t=\tBeep\n\\n\t=\tNova Linha\n\\t\t=\tTabula��o\n\\\\\t=\tBarra\n%%%%\t=\tPorcentagem\n\\?\t=\tInterroga��o");
    printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    system("pause");
}
