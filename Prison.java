import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Space> spaces = new ArrayList<Space>();
    private List<Prisioner> prisioners = new ArrayList<Prisioner>();
    private List<Guard> guards = new ArrayList<Guard>();


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
    public void setPrisioners (List<Prisioner> prisioners) {
        this.prisioners = prisioners;
    }

    public void setGuards (List<Guard> guards) {
        this.guards = guards;
    }
    public List <Prisioner> getPrisioners() {
        return this.prisioners;
    }

    public List <Guard> getGuards() {
        return this.guards;
    }

    public Room differentCellBlock (Room cellBlock) {
        for(Space a: this.spaces) {
            if (cellBlock.getName() != a.getName() && a.getId().startsWith("CB")) {
                return (Room) a;
            }
        }
        return null;

    } 
    public Guard getGuard(String name) {
        for (Guard g: this.guards) {
            if (g.getName().equals(name)) return g;
        }

        return null;
    }
}
 