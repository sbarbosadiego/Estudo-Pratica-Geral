#include <stdio.h>
#include <locale.h>
void main () {
    setlocale(LC_ALL,"Portuguese");
    printf("O %s tem %d anos\n","Diego", 23); // Em %s est� sendo referenciado o nome, j� em %d � referenciado o valor inteiro de idade
    printf("Seu peso atual � de %.2fKg\n", 79.0); /* Com %f � referenciado um valor float pode ser um usado um n�mero .2 ou 3.2,
    para informar quantas casas decimais informar antes ou ap�s v�rgula*/
    printf("O sexo � %c",'M'); // Quando utilizado %c � apenas referenciado uma letra, diferente de %s onde � a extens�o do que � escrito, tamb�m deve se usado aspas simples
}
