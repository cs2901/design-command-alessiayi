package command;

public class Kitchen {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();

    public boolean isOn;

    public Kitchen(){

    }

    public void turn(boolean  isOn){
        System.out.println("Kitchen: ");
        if (isOn){
            LightOnCommand lightOn = new LightOnCommand(light);
            remote.setCommand(lightOn);
            remote.buttonWasPressed();
        }
        else{
            LightOffCommand lightOff = new LightOffCommand(light);
            remote.setCommand(lightOff);
            remote.buttonWasPressed();
        }
    }
}
