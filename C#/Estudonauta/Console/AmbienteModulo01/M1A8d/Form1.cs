using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace M1A8d
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnOk_Click(object sender, EventArgs e)
        {
            int valor = 0;
            
            
            valor = Convert.ToInt16(txtValor.Text);
            valor = valor * 2;
            lblMensagem.Text = $"O dobro do valor é {valor}";
            lblMensagem.Visible = true;
        }
    }
}
