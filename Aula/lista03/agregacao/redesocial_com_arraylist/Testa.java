package lista03.agregacao.redesocial_com_arraylist;

public class Testa {

    public static void main(String args[]) {
        
        Usuario usr1 = new Usuario("arlano@gmai", "4567");
        Usuario usr2 = new Usuario( "ciclano@gmail.com", "321");
        Usuario usr3 = new Usuario("beltrano@gmail.com", "452");
   
        RedeSocial rs = new RedeSocial(1, "instagram", "www.instagram.com"); //pode ser feito assim se não receber o ArrayList como parametro, e alocando espaço na memoria 
        // rs.setCodigo(1);
        // rs.setName("Instagram");
        // rs.setUrl("www.instagram.com");
        rs.addUsuario(usr1); // adiciona usuário na rede social
        rs.addUsuario(usr2); // adiciona usuário na rede social
        rs.addUsuario(usr3); // adiciona usuário na rede social

        System.out.println(rs.toString());

   
    }
    
}


// package lista03.redsocial_agregacaocomarray;

// public class Testa {
    
//     public static void main(String args[]){

//         Usuario usr1 = new Usuario("fulano@email.com", "123");

//     }
// }
