package utilizando_o_terminal;
public class AboutMe {
    public static void main(String[] args) {
        //para passar os parametros via terminal, basta localizar o diretorio e digitar java nomeDoArquivo (sem o ".java") e os parametros separados por espaço. 
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
