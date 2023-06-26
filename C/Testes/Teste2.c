#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// O homem está aprendendo a usar printf e scanf eh mole

void main(){

    char nome[10]; /* Usando os colchetes é possível determinar o tamanho em caracteres da variável */
    unsigned int idade;/* Usando unsigneg é determinado que a variável int é apenas de números positivos */

    setlocale(LC_ALL,"Portuguese"); /* Novamente sendo utilizado uma função da biblioteca locale.h para ser lido caracteres em latin */
    printf("Qual o seu nome? ");
    scanf("%s",&nome); /* Na entrada é informado entre aspas a leitura de uma string com o %s em seguida informado a variável em que vai ser atribuído a entrada do dado */
    printf("Qual a sua idade? ");
    scanf("%i",&idade); /* Sempre utilizar no scanf & seguido do nome da variável */
    printf("Seu nome é %s, você tem %i de idade\n",nome,idade); /* Em caso de dúvidas quanto ao uso de expressões de controle consultar no livro de lógica II páginas 30 e 31 */
    system("pause");
}
