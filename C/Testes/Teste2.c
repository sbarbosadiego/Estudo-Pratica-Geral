#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// O homem est� aprendendo a usar printf e scanf eh mole

void main(){

    char nome[10]; /* Usando os colchetes � poss�vel determinar o tamanho em caracteres da vari�vel */
    unsigned int idade;/* Usando unsigneg � determinado que a vari�vel int � apenas de n�meros positivos */

    setlocale(LC_ALL,"Portuguese"); /* Novamente sendo utilizado uma fun��o da biblioteca locale.h para ser lido caracteres em latin */
    printf("Qual o seu nome? ");
    scanf("%s",&nome); /* Na entrada � informado entre aspas a leitura de uma string com o %s em seguida informado a vari�vel em que vai ser atribu�do a entrada do dado */
    printf("Qual a sua idade? ");
    scanf("%i",&idade); /* Sempre utilizar no scanf & seguido do nome da vari�vel */
    printf("Seu nome � %s, voc� tem %i de idade\n",nome,idade); /* Em caso de d�vidas quanto ao uso de express�es de controle consultar no livro de l�gica II p�ginas 30 e 31 */
    system("pause");
}
