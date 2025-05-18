
public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos != null ? alunos : new Aluno[0];
    }

    public void imprimirAprovados() {
        System.out.println("Alunos Aprovados:");
        imprimirPorStatus(true);
    }

    public void imprimirReprovados() {
        System.out.println("Alunos Reprovados:");
        imprimirPorStatus(false);
    }

    public void imprimirTodosComMedia() {
        System.out.println("Lista de Alunos com Média:");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("Aluno: %s | Média: %.2f | Status: %s%n",
                        aluno.getNome(),
                        aluno.calcularMedia(),
                        aluno.isAprovado() ? "Aprovado" : "Reprovado");
            }
        }
    }

    private void imprimirPorStatus(boolean aprovado) {
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.isAprovado() == aprovado) {
                System.out.println("Aluno " + aluno.getNome() + ": " +
                        (aprovado ? "Aprovado" : "Reprovado"));
            }
        }
    }
}
