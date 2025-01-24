import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorPessoas {
    public List<Pessoa> pessoas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarPessoa() {
        System.out.println("\n[ Cadastrar Pessoa ]");
        System.out.print("1. Funcionário\n2. Cliente\nEscolha o tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        int novoId = pessoas.size() + 1;

        if(tipo == 1) {
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            pessoas.add(new Funcionario(novoId, nome, idade, cargo));
        } else {
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            pessoas.add(new Cliente(novoId, nome, idade, telefone));
        }
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarPessoas() {
        System.out.println("\n[ Lista de Pessoas ]");
        for(Pessoa pessoa : pessoas) {
            pessoa.exibirDetalhes();
        }
    }

    public void atualizarPessoa() {
        System.out.print("\nDigite o ID da pessoa para atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        Pessoa pessoa = buscarPorId(id);
        if(pessoa == null) {
            System.out.println("Pessoa não encontrada!");
            return;
        }

        System.out.print("Novo nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.print("Nova idade: ");
        pessoa.idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        if(pessoa instanceof Funcionario) {
            System.out.print("Novo cargo: ");
            ((Funcionario) pessoa).cargo = scanner.nextLine();
        } else if(pessoa instanceof Cliente) {
            System.out.print("Novo telefone: ");
            ((Cliente) pessoa).telefone = scanner.nextLine();
        }
        System.out.println("Pessoa atualizada com sucesso!");
    }

    public void removerPessoa() {
        System.out.print("\nDigite o ID da pessoa para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        Pessoa pessoa = buscarPorId(id);
        if(pessoa != null) {
            pessoas.remove(pessoa);
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    private Pessoa buscarPorId(int id) {
        for(Pessoa pessoa : pessoas) {
            if(pessoa.id == id) {
                return pessoa;
            }
        }
        return null;
    }
}