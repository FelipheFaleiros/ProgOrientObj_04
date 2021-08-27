package aula.lista1.carro;
//package Aula1;

public class TestaCarro {
  // vamos criar os objetos
  // vamos criar o método main
  public static void main(String args[]) {
    // vamos dar um Hello World
    System.out.println("Hello World - Good night");
    // vamos criar um carro
    Carro obj1 = new Carro();
    obj1.modelo = "Gol";
    obj1.ano = 2009;
    obj1.motor = true;
    obj1.velocidade = 30;

    Carro obj2 = new Carro("Onix", 2016, true, 50); // chama o metodo construtor
    // inicializa os valores

    obj1.mostra();
    obj2.mostra();
  }
}