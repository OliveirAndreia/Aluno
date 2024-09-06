class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("ADS", "Graduação", 920.50);
        Curso curso2 = new Curso("Computação Aplicada", "Mestrado", 2150.45);

        Aluno a1 = new Aluno("Martin Fowler", curso1, 11223344, true, 20.5);
        Aluno a2 = new Aluno("Kent Beck", curso2, 22334455, false, 0);

        System.out.println(a1.getDados());
        System.out.println(a2.getDados());
    }
}