using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            float valor = 0;
            float.TryParse(txtValor.Text, out valor);

            lblTexto1.Text = $"Você digitou o valor {valor:N3}";
            lblTexto2.Text = $"A parte inteira do valor é: {(int)valor}";
            lblTexto3.Text = $"Arredondando, o valor será: {Convert.ToInt16(valor)}";

            painel.Visible = true;
        }
    }
}
