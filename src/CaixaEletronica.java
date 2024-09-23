public class CaixaEletronica {
    public static void main(String[] args) {
        // Condição Simples
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo);
        }else
            System.out.println("Saldo insuficiente");






    }
}
