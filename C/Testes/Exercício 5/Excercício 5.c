#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TOTAL2 10 /* Tamb�m pode ser declarado uma constante por meio de um define */

void main() {
    const int TOTAL = 8; /* Declara��o de valor constante */
    printf("%d\n", TOTAL);
    printf("%d", TOTAL2);
}
