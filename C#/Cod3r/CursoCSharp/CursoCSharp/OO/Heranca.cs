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

            public Carro() { }

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

            public int Acelerar()
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

        }

        public static void Executar()
        {

        }
    }
}
