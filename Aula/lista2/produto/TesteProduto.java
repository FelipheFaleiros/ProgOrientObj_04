package lista2.produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, 100, "Máscara", 3);
        prod1.comprar(10);
        prod1.subir(0.5f); //'f'força ele virar float, para não entender como conjunto de caracteres

        Produto prod2 = new Produto(2, 50, "Álcool em Gel", 15);

        prod2.venda(5);
        prod2.descer(5);

        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());

        Produto prod3 = new Produto();
        prod3.setPreco (15); //set usado para poder encapsular a variável 
        prod3.setQtde(10);
        prod3.setId(1);
        prod3.setDescricao ("sabonete");

        Produto prod4 = new Produto();
        prod4.setQtde(-3); //Não pode isso 
        prod4.setPreco (-13); //não pode isso 
        prod4.setId (-1); //não pode isso 
        prod4.setDescricao("chuveiro"); //não pode isso 

        Produto prod5 = new Produto(100, 5, "Xícara", 8);
        prod5.venda(7);
        prod5.descer(10);
        System.out.println(prod5.mostra());
    
        Produto prod6 = new Produto(200, -5, "Creme de barbear", -9);
        System.out.println(prod6.mostra());

    }

}
