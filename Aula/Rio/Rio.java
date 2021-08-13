package Rio;

 public class Rio {
      public String nome;
      public float nivel;
      public boolean poluido; //rio poluído é true e rio limpo é false
      
      public Rio () {
        
      }
      
      public Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
      }
      
      public void subir(float x) {
        this.nivel += x;
      }
      
      public void descer(float x) {
        this.nivel -= x;
      }
      
      public void limpar() {
        this.poluido = false;
      }
      
      public void sujar() {
        this.poluido = true;
      }
      
      public String mostra () {
        /*
        if (this.poluido == false) {
          System.out.println ("O rio " + this.nome + " está com o nivel em " + this.nivel + "mm, e está atualmente limpo.");
        }
        else {
          System.out.println ("O rio " + this.nome + " está com o nivel em " + this.nivel + "mm, e está atualmente poluido.");
        }
        */
        //Fazendo com operador ternário:
        String auxiliar = this.poluido? "está poluído" : "está limpo";
        return "Nome: " + this.nome + " Nivel: " + this.nivel + auxiliar;
      }
      
      
      /*
      public String mostra () {
        String auxiliar = this.poluido? "Está poluido" : "Está limpo";
        return "Nome: " + this.nome + " Nível: " + this.nivel + " " + auxiliar;
      }
      */
    
    
    }
    
    