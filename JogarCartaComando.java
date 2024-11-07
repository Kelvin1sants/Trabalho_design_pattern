public class JogarCartaComando implements Command {
    private Carta carta;

    public JogarCartaComando(Carta carta) {
        this.carta = carta;
    }

    @Override
    public void execute() {
        carta.jogar();
    }

    @Override
    public void undo() {
        carta.retirar();
    }
}

