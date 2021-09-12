package lista03.agregacao.redesocial_com_arraylist;
import java.util.ArrayList;

// ArrayList com agregação
public class RedeSocial {
    private int codigo;
    private String name;
    private String url;
    // associação com ArrayList
    private ArrayList<Usuario> usuarios; // vetor

    //construtores 
    //vazio
    public RedeSocial(){
        //alocar espaço na memória
        this.usuarios = new ArrayList<Usuario>();
    }   
   
    //completo
        public RedeSocial(int codigo, String name, String url) {
        this.codigo = codigo;
        this.name = name;
        this.url = url;
        this.usuarios = new ArrayList<Usuario>();
    }


    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    } 
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }



    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.name + " URL: " + this.url + "\n Usuários" + this.usuarios.toString();
    }

    
   // Usuario é o tipo do parâmetro, uma classe
   // usuario é o parâmetro, um obj
    public void addUsuario(Usuario usuario){ 
        this.usuarios.add(usuario); // adciona usuário no vetor
    }

}
