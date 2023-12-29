using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Fundamentos
{
    internal class OperadoresAritmeticos
    {
        public static void Executar()
        {
            string produtoNome, status;
            double preco, desconto = 0;

            Console.Write("Digite o nome do produto: ");
            produtoNome = Console.ReadLine();
            Console.Write($"Infome o valor do produto {produtoNome}: ");
            double.TryParse(Console.ReadLine(), out preco);
            Console.Write($"Será aplicado desconto no produto {produtoNome} no valor de {preco:C2}? ");
            status = Console.ReadLine().ToLower();
            if (status.Contains("s"))
            {
                Console.Write("Informe o desconto a ser aplicado: ");
                double.TryParse(Console.ReadLine(), out desconto);
                desconto = (preco * desconto) / 100;
                Console.WriteLine($"Produto: {produtoNome}\nValor Bruto: {preco}\nValor Líquido: {preco - desconto}\nDesconto Total: {desconto}");
            }
            


        }
    }
}
