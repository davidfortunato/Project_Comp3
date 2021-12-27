public class Room extends Space {
         
    public Room(String id, boolean limAccess, String name) {
        super(id, true, name);
    }
    
    public Contraband findContraband() {
        return null;
    }

    @Override
    public boolean equals(Object s) {
        if (!(s instanceof Room)) return false;

        return ((Room) s).getId() == this.getId();
    }
}