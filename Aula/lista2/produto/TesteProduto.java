package lista2.produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, 100, "Máscara", 3);
        prod1.comprar(10);
        prod1.subir(0.5f); //'f'força ele virar float, para não entender como conjunto de caracteres

        Produto prod2 = new Produto(2, 50, "Alcool em Gel", 15);

        prod2.venda(5);
        prod2.descer(5);

        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());
    }

}
