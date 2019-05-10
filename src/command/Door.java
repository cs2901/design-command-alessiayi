package command;

public class Door {
    private boolean isOpen = false;
    public void open(){
        isOpen = true;
        System.out.println("Door is "+isOpen);
    }

    public void close(){
        isOpen = false;
        System.out.println("Door is "+isOpen);
    }
}
