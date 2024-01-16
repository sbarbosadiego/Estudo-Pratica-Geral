using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ValorVsReferencia
    {
        public class Dependente
        {
            public string Nome;
            public int Idade;
        }

        public static void Executar()
        {
            int numero = 3;
            int copiaNumero = numero;

            Console.WriteLine($"numero: {numero}\nCopiaNumero: {copiaNumero}");
            numero++;
            Console.WriteLine($"numero: {numero}\nCopiaNumero: {copiaNumero}");

            Dependente dependente = new Dependente {Nome = "Udyr", Idade = 20};
            Dependente copiaDependente = dependente;

            Console.WriteLine($"Dependente: {dependente.Nome}\nCopiaDependente: {copiaDependente.Nome}");
            copiaDependente.Nome = "Udyr da Silva";
            Console.WriteLine($"Dependente: {dependente.Nome}\nCopiaDependente: {copiaDependente.Nome}");

        }
    }
}
