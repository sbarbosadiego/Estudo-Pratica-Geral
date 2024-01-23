using System;
using System.Collections;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Colecoes
{
    internal class ColecoesStack
    {
        public static void Executar()
        {
            var pilha = new Stack();

            // Adiciona um elemento a pilha
            pilha.Push(6);
            pilha.Push("Eh mole");
            pilha.Push(true);
            pilha.Push(4.32);

            foreach (var item in pilha) 
            {
                Console.Write($"{item} | ");
            }

            // Retorna o elemento do topo da pilha e remove o elemento da pilha
            Console.WriteLine($"\n{pilha.Pop()}");

            foreach (var item in pilha)
            {
                Console.Write($"{item} | ");
            }

            // Retorna o elemento do topo da pilha sem remover o elemento
            Console.WriteLine($"\n{pilha.Peek()}");
        }
    }
}
