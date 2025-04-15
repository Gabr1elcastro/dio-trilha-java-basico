package excecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376068");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O cep não atende os requisitos");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //simulando cep formatado.
        return "23.765-064";
    }

}
