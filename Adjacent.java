public class Adjacent {
    private int distance;
    private Space space;

    public Adjacent(Space space, int distance) {
        this.distance = distance;
        this.space = space;
    }

    public void setdistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {                      // allowing the classes to access the ID//
        return this.distance;

    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Space getSpace() {                      // allowing the classes to access the ID//
        return this.space;

    }


}
