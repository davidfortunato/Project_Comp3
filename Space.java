import java.util.ArrayList;
import java.util.List;


public abstract class Space implements Searcheable {

    private ArrayList<Adjacent> adjacents = new ArrayList<Adjacent>();
    private String id;         //creating the attributes of the objects ( hallways, cell blocks, etc.)//

    public Space(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {                      // allowing the classes to access the ID//
        return this.id;

    }
    
    public Space (ArrayList<Adjacent> adjacents) {
        this.adjacents=adjacents;
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

    public Space(String id, ArrayList <Adjacent> adjacents) {
        this.id = id;
        this.adjacents= adjacents;
    }
    
    @Override
    public String toString() {
        return "Space " + this.id + ": " + this.adjacents.size() + " adjacencies";
    }

}


