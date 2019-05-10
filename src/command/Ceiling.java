package command;

public class Ceiling {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Fan fan = new Fan();

    public Ceiling(){

    }

    public void intensity(boolean  isHigh){
        System.out.println("Ceiling: ");
        if (isHigh){
            FanHighCommand fanHigh = new FanHighCommand(fan);
            remote.setCommand(fanHigh);
            remote.buttonWasPressed();
        }
        else{
            FanLowCommand fanLow = new FanLowCommand(fan);
            remote.setCommand(fanLow);
            remote.buttonWasPressed();
        }
    }
}
