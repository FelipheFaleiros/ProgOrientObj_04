package Carro;
//package Aula1;

public class Carro {
  // 2 tipos de variaveis
  // TP Primitivo - int, float, double, char,
  // TP de classe - String, Float, Double, Integer
  // propriedades (variaveis) da classe
  float velocidade; // número com ponto flutuante
  boolean motor; // booleana - true (ligado) or false (desligado)
  int ano; // número inteiro
  String modelo; // String é uma classe pronta - cj de caracteres

  // método construtor 1
  public Carro() {

  }

  // método construtor 2
  public Carro(String modelo, int ano, boolean motor, float velocidade) {
    // variavel do obj = variavel do usuario
    this.modelo = modelo;
    this.ano = ano;
    this.motor = motor;
    this.velocidade = velocidade;
  }
  // um método ou operaçao

  public void mostra() {
    // qual palavra representa o objeto que chama o método
    System.out.println("Modelo : " + this.modelo + " Ano: " + this.ano + " Vel: " + this.velocidade);
  }
}