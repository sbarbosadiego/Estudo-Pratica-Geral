#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TOTAL2 10 /* Também pode ser declarado uma constante por meio de um define */

void main() {
    const int TOTAL = 8; /* Declaração de valor constante */
    printf("%d\n", TOTAL);
    printf("%d", TOTAL2);
}
