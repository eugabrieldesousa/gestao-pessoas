import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gestão de Pessoas ===");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Atualizar Pessoa");
            System.out.println("4. Remover Pessoa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch(opcao) {
                case 1:
                    gerenciador.adicionarPessoa();
                    break;
                case 2:
                    gerenciador.listarPessoas();
                    break;
                case 3:
                    gerenciador.atualizarPessoa();
                    break;
                case 4:
                    gerenciador.removerPessoa();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }
}