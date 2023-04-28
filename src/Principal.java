// SOBRESCRITA (OVERRIDE)  -> SOBRECARGA (OVERLOAD)

// Sobrescrita é a sobreposição de métodos com assinatura
// e nomes iguais, mas em classes diferentes, sendo
// herdados da classe mãe.
// A assinatura é idêntica ao método sobrescrito na classe mãe
public class Principal {
    public static void main(String[] args) {
        Acervo livro1 = new Acervo();

        livro1.entradaDados(); // É a sobrescrita
        livro1.mostrarDados();

        Livro livro2 = new Livro();
        livro2.entradaDados(); // É o original
        
        Venda v = new Venda();
        v.preco = 57.89f;
        v.quantLivros = 2;
        System.out.println("Valor da Venda: " +
                v.vendaLivro(v.preco,v.quantLivros));

        v.mostrarDados();
        }
    }
