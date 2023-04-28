public class Venda extends Acervo {
    // nome, autor, editora, quantLivros
    // entradaDados e mostrarDados -> ACERVO

    public float preco;

    public float vendaLivro(float preco, int quantLivro){
        this.preco = preco;
        float valorVenda = this.preco * quantLivro;
        this.quantLivros = this.quantLivros - quantLivro;
        return valorVenda;
    }
    public void mostrarDados(){
        super.mostrarDados(); // ACERVO
        System.out.println("Preço do Livro: " + this.preco);
    }
}
