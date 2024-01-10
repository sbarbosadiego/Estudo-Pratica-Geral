using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class Props
    {
        public class CarroOpcional
        {
            double desconto = 0.1;
            string nome;
            public string Nome
            {
                get { return "Opcional: " + nome;}
                set { nome = value; }
            }

            // Propriedade autoimplementada
            public double Preco { get; set; }

            // Somente leitura
            public double PrecoComDesconto
            {
                get => Preco - (desconto * Preco);
            }

            public CarroOpcional() { }

            public CarroOpcional(string nome, double preco)
            {
                this.Nome = nome;
                this.Preco = preco;
            }
        }
        public static void Executar()
        {
            var carro1 = new CarroOpcional("Ar-Condicionado", 2499.2);
            Console.WriteLine(carro1.PrecoComDesconto);
        }
    }
}
