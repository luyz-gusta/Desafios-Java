import Inclusao.*;

public class IndexInclusao {
    public static void main(String[] args) {
        SistemaInclusao sistema = new SistemaInclusao();

        Pessoa pessoa1 = new Pessoa("Carlos Silva", 34, "Visual", "moderado", "Rua das Flores, 123");
        Pessoa pessoa2 = new Pessoa("Ana Souza", 28, "Auditiva", "leve", "Av. Brasil, 45");

        Atendimento atendimento1 = new Atendimento("2025-04-01", "Fisioterapia", "Dr. João");
        Atendimento atendimento2 = new Atendimento("2025-04-10", "Psicologia", "Dra. Marta");

        pessoa1.adicionarAtendimento(atendimento1);
        pessoa1.adicionarAtendimento(atendimento2);
        pessoa2.adicionarAtendimento(new Atendimento("2025-03-15", "Terapia Ocupacional", "Dra. Clara"));

        pessoa1.cadastrar();
        pessoa2.cadastrar();
        atendimento1.cadastrar();

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);

        sistema.listarPessoas();
        sistema.listarPorFiltro("Visual", "moderado");
        sistema.gerarRelatorioAtendimentos("Carlos Silva");
    }
}
