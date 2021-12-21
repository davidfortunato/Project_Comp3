import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Space> spaces = new ArrayList<Space>();
    private List<Prisioner> prisioners = new ArrayList<Prisioner>();

    public void addSpace(Space space) {
        this.spaces.add(space);
    }

    public void addPrisioner(Prisioner prisioner) {
        this.prisioners.add(prisioner);
    }

}
 