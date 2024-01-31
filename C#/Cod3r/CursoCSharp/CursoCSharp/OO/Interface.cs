using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.OO
{
    // Por padrão os métodos são públicos e abstratos
    interface OperacaoBinaria
    {
        int Operacao(int a, int b);
    }

    interface Teste
    {
        bool Bla(string a);
    }

    // Uma classe pode herdar de múltiplas interfaces, mas apenas pode herdar de uma única classe
    class Soma : OperacaoBinaria, Teste
    {
        public int Operacao(int a, int b)
        {
            return a + b;
        }
        public bool Bla(string a)
        {
            return true;
        }
    }

    class Subtracao : OperacaoBinaria
    {
        public int Operacao(int a, int b)
        {
            return a - b;
        }
    }

    class Multiplicacao : OperacaoBinaria
    {
        public int Operacao(int a, int b)
        {
            return a * b;
        }
    }

    class Calculadora
    {
        List<OperacaoBinaria> operacoes = new List<OperacaoBinaria>
        {
            new Soma(),
            new Subtracao(),
            new Multiplicacao()
        };

        public string ExecutarOperacoes(int a, int b)
        {
            string resultado = "";

            foreach (var operacao in operacoes)
            {
                resultado += $"Usando {operacao.GetType().Name} = {operacao.Operacao(a ,b)}\n";
            }

            return resultado;
        }
    }

    internal class Interface
    {
        public static void Executar()
        {
            var calculadora = new Calculadora();
            var resultado = calculadora.ExecutarOperacoes(20, 5);
            Console.WriteLine(resultado);
        }
    }
}
