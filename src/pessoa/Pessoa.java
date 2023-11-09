package pessoa;
public class Pessoa implements Interface{
    private String nome;
    private String telefone;
    private char genero;
    
    public Pessoa(String nome,String telefone,char genero){
        this.nome = nome;
        this.telefone = telefone;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void Iprint(){
        System.out.println("Nome "+nome);
        System.out.println("Telefone "+telefone);
        System.out.println("Gênero "+genero);
    }
}
