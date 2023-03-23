package Members;

public class Cat extends Participant {

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    public void run() {
        System.out.println("Cat " + name + " is running " + maxRunDistance + " meters.");
    }

    public void jump() {
        System.out.println("Cat " + name + " is jumping " + maxJumpHeight + " meters.");
    }
}