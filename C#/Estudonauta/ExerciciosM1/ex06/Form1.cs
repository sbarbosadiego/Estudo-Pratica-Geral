using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int ano;
            int anoAtual = DateTime.Now.Year;

            ano = Convert.ToInt16(txtAno.Text);
            lblTexto1.Text = $"Estamos no ano de {anoAtual}";
            lblTexto2.Text = $"Quem nasceu em {ano} atualmente tem {anoAtual - ano} anos.";
            painel.Visible = true;


        }
    }
}
