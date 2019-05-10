package command;

public class FanHighCommand implements Command{
    Fan fan;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}
