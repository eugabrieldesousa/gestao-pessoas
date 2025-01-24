public class Cliente extends Pessoa {
    public String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        super(id, nome, idade);
        this.telefone = telefone;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Telefone: " + telefone);
    }
}