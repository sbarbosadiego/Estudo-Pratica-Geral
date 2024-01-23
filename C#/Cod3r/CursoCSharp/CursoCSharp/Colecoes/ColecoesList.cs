using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ColecoesList
    {
        public class Produto
        {
            public string Nome;
            public double Preco;

            public Produto(string nome, double preco)
            {
                Nome = nome;
                Preco = preco;
            }

            public override bool Equals(object obj)
            {
                Produto outroProduto = (Produto)obj;
                bool mesmoNome = Nome == outroProduto.Nome;
                bool mesmoPreco = Preco == outroProduto.Preco;
                return mesmoNome && mesmoPreco;
            }

            public override int GetHashCode()
            {

                return Nome.Length;
            }
        }

        public static void Executar()
        {
            Produto itemUm = new Produto("Diário da Mentirinha", 66.2);
            Produto itemDois = new Produto("Bicicleta Sem Roda", 266.2);

            List<Produto> carrinho = new List<Produto>();

            carrinho.Add(itemUm);
            carrinho.Add((itemDois));

            foreach (var item in carrinho)
            {
                Console.WriteLine($"{carrinho.IndexOf(item)+1}º - {item.Nome, -20} - {item.Preco:C}");
            }

        }
    }
}
