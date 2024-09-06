class Curso {
    private String nome;
    private String nivel;
    private double mensalidade;

    public Curso(String nome, String nivel, double mensalidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
