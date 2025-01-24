# Sistema de Gestão de Pessoas (CLI)

Um sistema CRUD simples para gestão de pessoas via linha de comando, implementando conceitos de POO.

## Funcionalidades

- **CRUD Completo**:
  - Cadastrar pessoas (Funcionários/Clientes)
  - Listar todas as pessoas cadastradas
  - Atualizar informações
  - Remover registros

- **Tipos de Pessoas**:
  - `Funcionário`: Nome, idade e cargo
  - `Cliente`: Nome, idade e telefone

- **Conceitos de POO**:
  - Herança (`Pessoa` → `Funcionario`/`Cliente`)
  - Polimorfismo (`exibirDetalhes()`)
  - Classes abstratas

## Pré-requisitos

- Java JDK 11 ou superior
- Terminal/CMD para execução

## Instalação e Execução

1. Clone o repositório ou copie os arquivos .java
2. Navegue até o diretório dos arquivos via terminal
3. Compile o projeto:
   ```bash
   javac *.java
Execute o programa:

Estrutura do Projeto

📂 SistemaGestaoPessoas/
├── Pessoa.java          # Classe abstrata base
├── Funcionario.java     # Implementação para funcionários
├── Cliente.java         # Implementação para clientes
├── GerenciadorPessoas.java  # Lógica de CRUD
└── Main.java            # Interface CLI e menu
Exemplos de Uso
Cadastrar Funcionário

=== Sistema de Gestão de Pessoas ===
1. Cadastrar Pessoa
2. Listar Pessoas
3. Atualizar Pessoa
4. Remover Pessoa
0. Sair
Escolha uma opção: 1

[ Cadastrar Pessoa ]
1. Funcionário
2. Cliente
Escolha o tipo: 1
Nome: João Silva
Idade: 35
Cargo: Desenvolvedor
Listar Pessoas

ID: 1 | Nome: João Silva | Idade: 35 | Cargo: Desenvolvedor
ID: 2 | Nome: Maria Souza | Idade: 28 | Telefone: (11) 9999-8888
Atualizar Registro

Digite o ID da pessoa para atualizar: 2
Novo nome: Maria Oliveira
Nova idade: 29
Novo telefone: (11) 98877-6655
Limitações Atuais
Dados armazenados apenas em memória (não persistente)

Campos públicos (sem encapsulamento)

Validações básicas de entrada

Licença
MIT License - livre para uso e modificação

Contribuição
Faça um fork do projeto

Crie sua branch (git checkout -b feature/nova-feature)

Commit suas mudanças (git commit -m 'Add new feature')

Push para a branch (git push origin feature/nova-feature)

Abra um Pull Request

Créditos
Desenvolvido como exemplo didático para demonstração de conceitos de POO em Java

Este README fornece:
- Visão geral do sistema
- Instruções claras de instalação/execução
- Exemplos práticos de uso
- Informações sobre arquitetura e design
- Diretrizes para contribuição

Você pode personalizar/adicionar seções conforme necessidade específica do projeto.
