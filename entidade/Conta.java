package entidade;

public class Conta{

 private int numero;
 private double saldo;

public Conta(int numero){
  
  this.numero = numero;
  this.saldo = 0;

}

public int getNumero(){
   return numero;
}

public double getSaldo(){
  return saldo;
}

public void creditar(double v){

      this.saldo = this.saldo + v;

}
public void debitar(double v){
               this.saldo = this.saldo - v;
     if(saldo < 0)
      this.saldo = this.saldo -10; 
      
}

}