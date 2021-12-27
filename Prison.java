import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Space> spaces = new ArrayList<Space>();
    private List<Prisioner> prisioners = new ArrayList<Prisioner>();

    public List<Space> getSpaces() {
        return this.spaces;
    }
    public void setSpaces (List<Space> spaces) {
        this.spaces = spaces;
    }
    public void addSpace(Space space) {
        this.spaces.add(space);
    }

    public Space getSpace(String id) {
        for (Space s: this.spaces) {
            if (s.getId().equals(id)) return s;
        }

        return null;
    }

    public Prisioner getPrisioner(String name) {
        for (Prisioner p: this.prisioners) {
            if (p.getName().equals(name)) return p;
        }

        return null;
    }

    public void addPrisioner(Prisioner prisioner) {
        this.prisioners.add(prisioner);
    }

}
 