package Members;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = {new Human("Ben", 750, 1),
                new Cat("Rita", 300, 2),
                new Robot("R2D2", 1800, 1)};
        Obstacle treadMill = new TreadMill(500);
        Obstacle wall = new Wall(0);
        Obstacle[] obstacles = {treadMill, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle == treadMill) {
                    if (participant.maxRunDistance >= obstacle.overcome()) {
                        participant.run();
                        System.out.println("And pass the TreadMill");

                    }
                    if (participant.maxRunDistance < obstacle.overcome()) {
                        participant.run();
                        System.out.println("Not pass TreadMill");
                        break;
                    }
                } else {
                    if (participant.maxJumpHeight >= obstacle.overcome()) {
                        participant.jump();
                        System.out.println("And jumper over the wall");

                    }
                    if (participant.maxJumpHeight < obstacle.overcome()) {
                        participant.jump();
                        System.out.println("And didn't jump over the wall");
                        break;


                    }
                }
            }


        }
    }
}
