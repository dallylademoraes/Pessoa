package pessoa;
public class PessoaFisica extends Pessoa implements Interface{

    private String cpf;
    
    public PessoaFisica(String nome, String telefone, char genero) {
        super(nome, telefone, genero);
        this.cpf = cpf;
    }
        public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void iprint(){
        super.Iprint();
        System.out.println("CPF "+cpf);
    }
}
