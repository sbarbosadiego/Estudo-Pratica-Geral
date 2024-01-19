using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static CursoCSharp.ClassesEMetodos.ColecoesList;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ColecoesSet
    {

        public static void Executar()
        {
            var itemUm = new Produto("Diário da Mentirinha", 66.2);
            var itemDois = new Produto("Bicicleta Sem Roda", 266.2);

            // Estrutura não indexada e que não aceita repetições
            var carrinho = new HashSet<Produto>();

            carrinho.Add(itemUm);
            carrinho.Add((itemDois));

            foreach (var item in carrinho)
            {
                Console.WriteLine($"{item.Nome, -20} - {item.Preco:C}");
            }

        }
    }
}
