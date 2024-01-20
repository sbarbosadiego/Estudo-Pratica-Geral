using System;
using System.Collections.Generic;
using System.Collections;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Colecoes
{
    internal class ColecoesQueue
    {
        public static void Executar()
        {
            var fila = new Queue<string>(); // Define o tipo dado da fila
            var filaDois = new Queue(); // Cria uma fila sem um tipo dado definido

            fila.Enqueue("Udyr da Silva");
            fila.Enqueue("Thoma Shelby");
            fila.Enqueue("Eh mole");

            Console.WriteLine(fila.Peek()); // Mostra o primeiro da fila, sem remover o elemento
            Console.WriteLine(fila.Count());
            Console.WriteLine(fila.Dequeue()); // Remove o elemento da fila
            Console.WriteLine(fila.Count());

            foreach (var elemento in fila)
            {
                Console.WriteLine(elemento.ToString());
            }
        }
    }
}
