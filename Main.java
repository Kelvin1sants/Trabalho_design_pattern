public class Main {
    public static void main(String[] args) {
        Carta cartaRara1 = new Carta("Dragão Branco de Olhos Azuis");
        Carta cartaRara2 = new Carta("Dragão Negro de Olhos Vermelhos");

        Command jogarCarta1 = new JogarCartaComando(cartaRara1);
        Command jogarCarta2 = new JogarCartaComando(cartaRara2);

        Jogo jogo = new Jogo();

        // Jogando a primeira carta rara
        jogo.setCommand(jogarCarta1);
        jogo.pressionarBotaoJogar();

        // Jogando a segunda carta rara
        jogo.setCommand(jogarCarta2);
        jogo.pressionarBotaoJogar();

        // Desfazendo a última ação (retirando a segunda carta rara)
        jogo.pressionarBotaoDesfazer();
    }
}
