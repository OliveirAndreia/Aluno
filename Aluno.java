class Aluno {
    private String nome;
    private int codigoMatricula;
    private boolean eBolsista;
    private double desconto;
    private Curso curso;

    public Aluno(String nome, Curso curso,
                 int codigoMatricula,
                 boolean eBolsista,
                 double desconto) {
        this.nome = nome;
        this.curso = curso;
        this.codigoMatricula = codigoMatricula;
        this.eBolsista = eBolsista;
        this.desconto = desconto;
    }

    // Método que só faz consulta (query)
    public double calcularMensalidadeComDesconto() {
        if (eBolsista) {
            return curso.getMensalidade() * (1 - desconto / 100);
        }
        return curso.getMensalidade();
    }

    // Método que apenas consulta (sem modificar o estado)
    public String getDados() {
        String resp = "Aluno: " + this.nome + "\n";
        resp += "Curso: " + curso.getNivel() + " em " + curso.getNome() + "\n";
        if (eBolsista) {
            resp += "Bolsista com desconto de: " + this.desconto + "%\n";
            resp += "Mensalidade: R$ " + calcularMensalidadeComDesconto();
        } else {
            resp += "Mensalidade: R$ " + curso.getMensalidade();
        }

        return resp;
    }
}
