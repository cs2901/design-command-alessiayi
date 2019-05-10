package command;

public class Garage {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Door door = new Door();

    public Garage(){

    }

    public void open(boolean  isOpen){
        System.out.println("Garage: ");
        if (isOpen){
            DoorOpenCommand doorOpen = new DoorOpenCommand(door);
            remote.setCommand(doorOpen);
            remote.buttonWasPressed();
        }
        else{
            DoorCloseCommand doorClose = new DoorCloseCommand(door);
            remote.setCommand(doorClose);
            remote.buttonWasPressed();
        }
    }
}
