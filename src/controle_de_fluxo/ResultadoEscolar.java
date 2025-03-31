package controle_de_fluxo;
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;
        String resultado = nota >=7 ? "Aprovado!" : nota >=5 && nota <7 ? "Recuperação!" : "Reprovado!";//Expressão ternaria
        System.out.println(resultado);
    }
}