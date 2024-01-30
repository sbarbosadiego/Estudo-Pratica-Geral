using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.OO
{
    internal class Polimorfismo
    {
        public class Comida
        {
            public double Peso;

            public Comida() { }

            public Comida(double peso)
            {
                Peso = peso;
            }
        }

        public class Feijao : Comida
        {
            // Faz ser necessário informar o peso na construção do objeto
            public Feijao(double peso) : base(peso) { }
        }

        public class Arroz : Comida
        {
            
        }
        public class Carne : Comida
        {
            
        }

        public class Pessoa
        {
            public double Peso;

            public void Comer(Comida comida)
            {
                Peso += comida.Peso;
            }

        }
        public static void Executar()
        {
            Pessoa cliente = new Pessoa();
            Feijao ingredienteUm = new Feijao(0.3);
            Arroz ingredienteDois = new Arroz();
            Carne ingredienteTres = new Carne();

            cliente.Peso = 80.0;
            ingredienteDois.Peso = 0.25;
            ingredienteTres.Peso = 0.3;

            cliente.Comer(ingredienteUm);
            cliente.Comer(ingredienteDois);
            cliente.Comer(ingredienteTres);

            Console.WriteLine($"Peso: {cliente.Peso}");

        }
    }
}
