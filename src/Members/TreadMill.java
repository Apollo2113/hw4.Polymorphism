package Members;

public class TreadMill extends Obstacle {
    private int length;

    public TreadMill(int length) {
        this.length = length;
    }
    public int overcome() {
        return length;
    }
}