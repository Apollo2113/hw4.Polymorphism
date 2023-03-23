package Members;

public class Robot extends Participant {
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }
    public void run() {
        System.out.println("Robot " + name + " is running " + maxRunDistance + " meters.");
    }
    public void jump() {
        System.out.println("Robot " + name + " is jumping " + maxJumpHeight + " meters.");
    }
}
