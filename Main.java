import entidade.Conta;

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



    System.out.println("fim teste Cliente!");

    
  }
}