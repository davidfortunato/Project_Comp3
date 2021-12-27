import java.util.ArrayList;
import java.util.List;


public abstract class Space implements Searcheable {

    private ArrayList<Adjacent> adjacents = new ArrayList<Adjacent>();
    private String id;         //creating the attributes of the objects ( hallways, cell blocks, etc.)//
    private boolean limAccess;
    private String name;

    public Space(String id, boolean limAccess, String name) {
        this.id = id;
        this.limAccess = limAccess;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {                      // allowing the classes to access the ID//
        return this.id;
    }

    public void setlimAccess(boolean limAccess) {
        this.limAccess = limAccess;
    }

    public boolean getLimAccess() {                      // allowing the classes to access the ID//
        return this.limAccess;
    }

    private void addAdjacent( Adjacent adjacent, boolean circle) {
        this.adjacents.add(adjacent);

        if (circle) return;

        Space space2 = adjacent.getSpace();
        Adjacent newAdjacent = new Adjacent(this, adjacent.getDistance());

        space2.addAdjacent(newAdjacent, true);
    }

    public void addAdjacentList(List<Adjacent> adjacents) {
        for (Adjacent a: adjacents) {
            this.addAdjacent(a, false);
        }
    }
    
    public ArrayList<Adjacent> getAdjacent() {                      // allowing the classes to access the adjacent//
        return this.adjacents;
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + "(" + this.id  + ")";
    }

    @Override
    public boolean equals(Object s) {
        if (!(s instanceof Space)) return false;

        return ((Space) s).getId() == this.id;
    }
}


