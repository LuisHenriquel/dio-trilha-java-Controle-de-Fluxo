public class FormatadorCepExemplo {
    public static void main(String[] args) throws CepInvalidoExcecao {
        String cepFormatado = formatarCep("2765064");
        System.out.println(cepFormatado);
    }

    static String formatarCep(String cep) throws CepInvalidoExcecao{
        if(cep.length() != 8)
            throw new CepInvalidoExcecao();

        //Simulando um cep formatado
        return "23.765-064";
    }

}
