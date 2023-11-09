package pessoa;
public class PessoaJuridica extends Pessoa implements Interface{
    private String nome_empresa;
    public PessoaJuridica(String nome, String telefone, char genero, String nomeEmpresa) {
        super(nome, telefone, genero);
        this.nome_empresa = nome_empresa;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }
    public void Iprint(){
        super.Iprint();
        System.out.println("Nome da empresa: "+nome_empresa);
}
}
