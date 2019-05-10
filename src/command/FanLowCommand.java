package command;

public class FanLowCommand implements Command{
    Fan fan;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.low();
    }

}
