public class Jogo {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressionarBotaoJogar() {
        command.execute();
    }

    public void pressionarBotaoDesfazer() {
        command.undo();
    }
}

