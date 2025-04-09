package estrutura_de_repeticoes;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Rique", "Clayton", "Gabriel", "Th"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O alunos no indice x=" + x + "é" + alunos[x]); 
        }
    }
}
