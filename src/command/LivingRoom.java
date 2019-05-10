package command;

public class LivingRoom {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();

    public boolean isOn;

    public LivingRoom(){

    }

    public void turn(boolean  isOn){
        System.out.println("Living Room: ");
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
