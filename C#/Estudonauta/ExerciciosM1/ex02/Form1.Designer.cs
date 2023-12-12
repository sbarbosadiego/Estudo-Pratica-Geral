namespace ex02
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblMensagem = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.lblMensagem2 = new System.Windows.Forms.Label();
            this.lblMensagem1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblMensagem
            // 
            this.lblMensagem.AutoSize = true;
            this.lblMensagem.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMensagem.Location = new System.Drawing.Point(26, 57);
            this.lblMensagem.Name = "lblMensagem";
            this.lblMensagem.Size = new System.Drawing.Size(66, 29);
            this.lblMensagem.TabIndex = 0;
            this.lblMensagem.Text = "MEU";
            this.lblMensagem.Visible = false;
            this.lblMensagem.Click += new System.EventHandler(this.label1_Click);
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(124, 141);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(129, 51);
            this.button1.TabIndex = 1;
            this.button1.Text = "INICIAR";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // lblMensagem2
            // 
            this.lblMensagem2.AutoSize = true;
            this.lblMensagem2.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMensagem2.Location = new System.Drawing.Point(200, 57);
            this.lblMensagem2.Name = "lblMensagem2";
            this.lblMensagem2.Size = new System.Drawing.Size(154, 29);
            this.lblMensagem2.TabIndex = 2;
            this.lblMensagem2.Text = "BRASILEIRO";
            this.lblMensagem2.Visible = false;
            this.lblMensagem2.Click += new System.EventHandler(this.lblMensagem2_Click);
            // 
            // lblMensagem1
            // 
            this.lblMensagem1.AutoSize = true;
            this.lblMensagem1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMensagem1.Location = new System.Drawing.Point(98, 57);
            this.lblMensagem1.Name = "lblMensagem1";
            this.lblMensagem1.Size = new System.Drawing.Size(96, 29);
            this.lblMensagem1.TabIndex = 3;
            this.lblMensagem1.Text = "BRASIL";
            this.lblMensagem1.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(388, 250);
            this.Controls.Add(this.lblMensagem1);
            this.Controls.Add(this.lblMensagem2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lblMensagem);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Brasil";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblMensagem;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label lblMensagem2;
        private System.Windows.Forms.Label lblMensagem1;
    }
}

