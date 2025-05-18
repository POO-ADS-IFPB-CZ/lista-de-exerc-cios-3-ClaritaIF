public class Aluno {
    private String nome;
    private String matricula;
    private float[] notas;
    private int notasCadastradas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new float[4];
        this.notasCadastradas = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean definirNota(float nota) {
        if (notasCadastradas < 4) {
            notas[notasCadastradas++] = nota;
            return true;
        } else {
            System.out.println("Limite de 4 notas já foi atingido.");
            return false;
        }
    }

    public float calcularMedia() {
        if (notasCadastradas == 0) return 0;
        
        float soma = 0;
        for (int i = 0; i < notasCadastradas; i++) {
            soma += notas[i];
        }
        return soma / notasCadastradas;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7.0f;
    }

    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Status: " + (isAprovado() ? "Aprovado" : "Reprovado"));
    }
}
