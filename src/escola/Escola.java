package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno dryego = new Aluno();

        dryego.setNome("Dryego Lisboa Barbosa");
        dryego.setIdade(35);

        System.out.println("O aluno " + dryego.getNome() + " tem " + dryego.getIdade() + ".");
    }
}
