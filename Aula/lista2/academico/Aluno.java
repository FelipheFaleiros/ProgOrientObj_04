package lista2.academico;

public class Aluno {
    private float p1, p2;
    private int idade, numeroAluno;
    private String nome;

    public Aluno(){

    }

    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.setNome(nome);
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public final void  setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome do aluno não pode ser grande");
        }

    }
    
    public final void setNumeroAluno(int numeroAluno){
        //converter numeroAluno para String
        String numeroAlunoString = String.valueOf(numeroAluno);
        // String numeroAlunoString = Integer.toString(numeroAluno); //outra forma 
        if (numeroAlunoString.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Número do aluno não pode ser negativo");
        }

    }

    public final void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("Idade não pode ser negativa");
        }

    }

    public final void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else {
            System.out.println("A nota não pode ser negativa");
        }
    }

    public final void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else {
            System.out.println("A nota não pode ser negativa");
        }

    }

    //getters
    //usado para acessar seus valor por outras classe por serem privadas
    //método que retornando um inteiro 
    public int getIdade(){ 
        return this.idade;
    }

    //método que retornando um float
    public float getP1(){
        return this.p1;
    }

    //método que retornando um float
    public float getP2(){
        return this.p2;
    }

    //método que retornando um inteiro
    public int getNumeroAluno(){
        return this.numeroAluno;
    }

    //método que retornando uma String
    public String getNome(){
        return this.nome;  
    }

    public String toString(){ //retornar as informações 
        return"Número do aluno " + this.numeroAluno + ",  Nome " + this.nome + ",  p1 " + this.p1 +  ", p2 " + this.p2 + ",  idade " + this.idade;
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2; 
    }
}
