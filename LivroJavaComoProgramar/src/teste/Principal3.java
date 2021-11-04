package teste;
import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args){
		
        Scanner teclado = new Scanner(System.in);

        int opcao, buscaMatricula;

        

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
		

        System.out.print("\tDigite a op��o desejada: \n\t"); 
        opcao = teclado.nextInt();


        System.out.println("Digite o nome e a matricula do aluno 1: ");
        String nome = teclado.nextLine();
        a1.setNome(nome);


        System.out.println("Digite a matricula do aluno 1: ");
        int matricula = teclado.nextInt();
        a1.setMatricula(matricula);

        teclado.close();


}

}