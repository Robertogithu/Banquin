import entidade.Conta;
import entidade.Cliente;
import regra.Operacao;


class Main {
  public static void main(String[] args) 
  {
       Cliente cliente =  new Cliente();
       cliente.nome = "Bonitão";

       //System.out.println("Cliente: " + cliente.nome);

       System.out.println("\nRELATORIO *** ");
       System.out.println("CLIENTE: "  + cliente.nome);

      Conta conta = new Conta(12345);


      System.out.println("Conta: " + conta.getNumero()  +  "=(R$)"  + conta.getSaldo());
      conta.creditar(1000);
      conta.debitar(500);
      System.out.println("Conta: " + conta.getNumero() +  "=(R$)"   + conta.getSaldo());
      
      conta.debitar(1000);
      conta.debitar(100);

      System.out.println("Conta: " + conta.getNumero() +  "=(R$)"   + conta.getSaldo());

Conta conta2 = new Conta(222222);
    System.out.println("CONTA2: " + conta2.getNumero() + " = (R$) " + conta2.getSaldo());

		//Operacao obj = new Operacao();
		//obj.transferir(100, conta, conta2);
	  
    Operacao.transferir(100, conta, conta2);

    System.out.println("CONTA2: " + conta2.getNumero() + " = (R$) " + conta2.getSaldo());


		System.out.println("teste controle de tipo!");

		for (int x=0; x<20; x++) {
			conta2.creditar(10);
		}

    System.out.println("fim teste Cliente!");

    
  }
}