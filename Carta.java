public class Carta {
    private String nome;

    public Carta(String nome) {
        this.nome = nome;
    }

    public void jogar() {
        System.out.println("Carta jogada: " + nome);
    }

    public void retirar() {
        System.out.println("Carta retirada: " + nome);
    }
}

