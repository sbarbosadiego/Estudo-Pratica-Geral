using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class Construtores
    {
        class Carro {
            public string Modelo;
            public string Fabricante;
            public int Ano;

            // Construtor Vazio
            public Carro ()
            {

            }

            // Construtor com passagem de parâmetro
            public Carro(string modelo, string fabricante, int ano)
            {
                this.Modelo = modelo;
                this.Fabricante = fabricante;
                this.Ano = ano;
            }

            public void Apresentar()
            {
                Console.WriteLine($"Modelo: {this.Modelo} | Fabricante: {this.Fabricante} | Ano: {this.Ano}");
            }

        }
        public static void Executar()
        {
            /**
             * A ideia de criar dois construtores, é útil quando pode ou não
             * haver a necessidade de criar um novo objeto já com valores definidos
             * ou em caso que será definido os valores no decorrer da aplicação
             */
            Carro carro1 = new Carro();
            Carro carro2 = new Carro("325i", "BMW", 2017);
            // Um outra forma de atribuir valores ao construtor
            var carro3 = new Carro() {Fabricante = "Fiat", Modelo = "Uno", Ano = 2019};

            carro1.Apresentar();
            carro2.Apresentar();
            carro3.Apresentar();


        }
    }
}
