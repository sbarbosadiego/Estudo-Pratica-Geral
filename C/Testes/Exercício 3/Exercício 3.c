#include <stdio.h>
#include <locale.h>
void main () {
    setlocale(LC_ALL,"Portuguese");
    printf("O %s tem %d anos\n","Diego", 23); // Em %s está sendo referenciado o nome, já em %d é referenciado o valor inteiro de idade
    printf("Seu peso atual é de %.2fKg\n", 79.0); /* Com %f É referenciado um valor float pode ser um usado um número .2 ou 3.2,
    para informar quantas casas decimais informar antes ou após vírgula*/
    printf("O sexo é %c",'M'); // Quando utilizado %c é apenas referenciado uma letra, diferente de %s onde é a extensão do que é escrito, também deve se usado aspas simples
}
