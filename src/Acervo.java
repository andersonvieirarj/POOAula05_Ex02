public class Acervo extends Livro {
    // Acervo já possui por herança: nome,
    // autor, editora e dois métodos
    public int quantLivros;
    public void entradaDados(){
        super.entradaDados();
        System.out.println("Digite a quantidade de Livros: ");
        quantLivros = input.nextInt();
    }
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Quantidade de Livros Em " +
                "Estoque: " + quantLivros);
    }
}
