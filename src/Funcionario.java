public class Funcionario extends Pessoa {
    public String cargo;

    public Funcionario(int id, String nome, int idade, String cargo) {
        super(id, nome, idade);
        this.cargo = cargo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Cargo: " + cargo);
    }
}