package pract8.comand;


class Executer {
    public Command command;
    public Executer(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
