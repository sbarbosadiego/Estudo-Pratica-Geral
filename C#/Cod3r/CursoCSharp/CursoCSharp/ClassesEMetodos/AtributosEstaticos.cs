using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class AtributosEstaticos
    {
        public class Produto
        {
            public string Nome;
            public double Preco;
            public static double Desconto = 0.1;

            public Produto(string nome, double preco, double desconto)
            {
                this.Nome = nome;
                this.Preco = preco;
                Desconto = desconto;
            }

            public Produto() { }

            public double CalcularDesconto()
            {
                return Preco - Preco * Desconto;
            }
        }

        public static void Executar()
        {
            var produtoUm = new Produto("Caneta", 3.2, 0.1);
            var produtoDois = new Produto("Borracha", 5.3, 0.5);

            Console.WriteLine($"Preço com desconto: {produtoUm.CalcularDesconto():C}");
            Console.WriteLine($"Preço com desconto: {produtoDois.CalcularDesconto():C}");

        }
    }
}
