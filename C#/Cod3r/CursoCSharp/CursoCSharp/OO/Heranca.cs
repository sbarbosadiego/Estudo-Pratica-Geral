using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.OO
{
    internal class Heranca
    {
        public class Carro
        {
            protected readonly int VelocidadeMaxima;
            private int VelocidadeAtual;

            public Carro(int velocidadeMaxima)
            {
                VelocidadeMaxima = velocidadeMaxima;
            }
            protected int AlterarVelocidade(int delta)
            {
                int novaVelocidade = VelocidadeAtual + delta;
                if (novaVelocidade < 0)
                {
                    VelocidadeAtual = 0;
                } else if (novaVelocidade > VelocidadeMaxima)
                {
                    VelocidadeAtual = VelocidadeMaxima;
                } else
                {
                    VelocidadeAtual = novaVelocidade;
                }
                return VelocidadeAtual;
            }

            // Virtual indica que o método pode ser subrescrito
            public virtual int Acelerar()
            {
                return AlterarVelocidade(5);
            }

            public int Frear()
            {
                return AlterarVelocidade(-5);
            }
        }

        // Para herdar atributos e métodos utilizar o :
        public class Uno : Carro
        {
            // No construtor da classe uso, pode ser chamado o construtor pai através do base
            public Uno() : base(200) { }
        }

        public class Ferrari : Carro
        {
            public Ferrari() : base(350) { }

            public override int Acelerar()
            {
                return AlterarVelocidade(15);
            }

            // Oculta o método da classe pai
            public new int Frear()
            {
                return AlterarVelocidade(-15);
            }
        }

        public static void Executar()
        {
            Console.WriteLine("Uno ");
            Uno carroUm = new Uno();
            Ferrari carroDois = new Ferrari();
            Carro CarroTres = new Ferrari();

            Console.WriteLine(carroUm.Acelerar());
            Console.WriteLine(carroUm.Acelerar());
            Console.WriteLine(carroUm.Acelerar());
            Console.WriteLine(carroUm.Frear());
            Console.WriteLine(carroUm.Frear());
            Console.WriteLine(carroUm.Frear());
            Console.WriteLine(carroUm.Frear());

            Console.WriteLine("Ferrari ");
            Console.WriteLine(carroDois.Acelerar());
            Console.WriteLine(carroDois.Acelerar());
            Console.WriteLine(carroDois.Acelerar());
            Console.WriteLine(carroDois.Frear());

            Console.WriteLine("Ferrari com tipo Carro");
            Console.WriteLine(CarroTres.Acelerar());
            Console.WriteLine(CarroTres.Acelerar());
            Console.WriteLine(CarroTres.Acelerar());
            Console.WriteLine(CarroTres.Frear());

        }
    }
}
