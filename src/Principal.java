import java.util.Scanner;
import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.print("Digite o gênero (M/F): ");
        char genero = scanner.nextLine().charAt(0);
        
        System.out.print("Digite o nome da empresa (caso seja Pessoa Jurídica): ");
        String nomeEmpresa = scanner.nextLine();
        
        Pessoa pessoa;
        if (nomeEmpresa.isEmpty()) {
            pessoa = new PessoaFisica(nome, telefone, genero);
        } else {
            pessoa = new PessoaJuridica(nome, telefone, genero, nomeEmpresa);
        }
        
        System.out.println("\nInformações inseridas:");
        pessoa.Iprint();
        
        scanner.close();
    }
}
