public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 10;
        if(nota>= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) {
        System.out.println("Prova de Recuperção");

        }else
            System.out.println("Reprovado");

        //      Condição Ternária
        /*
           int nota = 7;
           String resultado = nota >=7 ? "APROVADO" : "REPROVADO";
           System.out.prinln(resultado);
        */



    }
}
