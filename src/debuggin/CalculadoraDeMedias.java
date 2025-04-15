package debuggin;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"camila", "Lucas", "Bruna", "Pedro"};

        double media = calculadoraDeMediasDaTurma(alunos, scan);

        System.out.println("Média da turma : " + media);
    }

    public static double calculadoraDeMediasDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for(String aluno: alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }


}
