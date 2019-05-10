package command;

public class DoorCloseCommand implements Command{
    Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {

        door.close();
    }
}
