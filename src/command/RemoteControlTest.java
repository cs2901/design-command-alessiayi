package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Stereo stereo = new Stereo();

        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);

        LivingRoom livingRoom = new LivingRoom();
        livingRoom.turn(false);
        System.out.println("\n");

        Kitchen kitchen = new Kitchen();
        kitchen.turn(true);
        System.out.println("\n");

        Ceiling ceiling = new Ceiling();
        ceiling.intensity(true);
        System.out.println("\n");

        Garage garage = new Garage();
        garage.open(false);
        System.out.println("\n");

        remote.setCommand(stereoOn);
        remote.buttonWasPressed();

        remote.setCommand(stereoOff);
        remote.buttonWasPressed();
    }
}
