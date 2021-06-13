package entidade;

public class Conta {

    private int numero;
    private double saldo;
		private int tipo; //1 COMUM, 2 ESPECIAL
		private int totalOpers;


    public Conta(int numero) {

        this.numero = numero;
        this.saldo = 0;
				this.tipo = 1; //comum

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double v) {

        this.saldo = this.saldo + v;


        totalOpers++;

				if (totalOpers > 100)
					this.promove();
        
    }

    public void debitar(double v) {

      if (this.tipo == 2){
          saldo -=v;
              if (saldo -v <0){
              saldo -= v;               
              saldo -= 10;
          } else {
            saldo -= v;
          }
      }

        this.saldo = this.saldo - v;
		    
				if (this.saldo < 0)
			    this.saldo = this.saldo - 10;


        totalOpers++;

				if (totalOpers > 100)
					this.promove();
        

		}

    
		private void promove() {

			if (this.tipo == 1) { //se COMUM

				this.tipo = 2; //promove ESPECIAL

			}

			System.out.println("Uhuuu, sou ESPECIAL!: " + this.totalOpers);

		}






}