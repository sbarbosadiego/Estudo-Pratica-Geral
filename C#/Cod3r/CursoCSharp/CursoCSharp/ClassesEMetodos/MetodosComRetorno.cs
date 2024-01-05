using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class MetodosComRetorno
    {
        class CalculadoraComum {
            public int Somar(int a, int b)
            {
                return a + b;
            }

            public int Somar(int a, int b, int c)
            {
                return a + b + c;
            }

            public int Subtrair(int a, int b)
            {
                return a - b;
            }

            public int Multiplicar(int a, int b)
            {
                return a * b;
            }
        }

        public class CalculadoraCadeia {
            int memoria;

            public CalculadoraCadeia Somar(int a)
            {
                this.memoria += a;
                return this;
            }

            public CalculadoraCadeia Multiplicar(int a)
            {
                this.memoria *= a;
                return this;
            }

            public CalculadoraCadeia Limpar()
            {
                this.memoria = 0;
                return this;
            }

            public CalculadoraCadeia Imprimir()
            {
                Console.WriteLine(this.memoria);
                return this;
            }

            public int Resultado()
            {
                return this.memoria;
            }
        }

        public static void Executar()
        {
            CalculadoraComum soma = new CalculadoraComum();
            CalculadoraCadeia calculadoraCadeia = new CalculadoraCadeia();

            Console.WriteLine(soma.Somar(5, 2));
            Console.WriteLine(soma.Somar(5, 5, 5));
            Console.WriteLine(soma.Subtrair(20, 5));
            Console.WriteLine(soma.Multiplicar(3, 3));

            // Desta forma é possível encadear o retorno com métodos da própria classe
            calculadoraCadeia.Somar(5).Multiplicar(3).Imprimir().Limpar().Imprimir();

            /* Após usar o método de Resultado, o retorno é um int, desta forma os métodos a serem
             * encadeados serão referentes ao tipo int
             */
            int resultado = calculadoraCadeia.Somar(9).Multiplicar(7).Resultado();
            Console.WriteLine(resultado);

        }
    }
}
