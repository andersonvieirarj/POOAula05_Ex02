import java.util.Scanner;
public class Livro {
    public String nome;
    public String autor;
    public String editora;
    Scanner input = new Scanner(System.in);
    // Método para realizar a entrada de dados:
    public void entradaDados(){
        System.out.println("Informe o nome do livro: ");
        nome = input.nextLine();
        System.out.println("Informe o nome do autor: ");
        autor = input.nextLine();
        System.out.println("Informe o nome do editora: ");
        editora = input.nextLine();
     }
     public void mostrarDados(){
         System.out.println("Nome do Livro: " + this.nome);
         System.out.println("Nome do Autor: " + this.autor);
         System.out.println("Editora: " + this.editora);
     }
}
