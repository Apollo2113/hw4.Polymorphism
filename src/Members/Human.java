package Members;

public class Human extends Participant {

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }
    public void run() {
        System.out.println("Human " + name + " is running " + maxRunDistance + " meters.");
    }

    public void jump() {
        System.out.println("Human " + name + " is jumping " + maxJumpHeight + " meters.");
    }
}

