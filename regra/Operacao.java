package regra;

import entidade.Conta;

public class Operacao{

public static void transferir(double v, Conta o, Conta d) {

        o.debitar(v);
        d.creditar(v);

    }

}