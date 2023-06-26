#include <stdio.h>
#include <stdlib.h>
#include <locale.h> // Biblioteca para importação de codificação de caracteres
void main(){
    setlocale(LC_ALL,"Portuguese"); // Formatação para codificar os caracteres
    printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    printf("\n\a\\a\t=\tBeep\n\\n\t=\tNova Linha\n\\t\t=\tTabulação\n\\\\\t=\tBarra\n%%%%\t=\tPorcentagem\n\\?\t=\tInterrogação");
    printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    system("pause");
}
