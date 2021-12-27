public class Pathway extends Space {
         
    public Pathway(String id, boolean limAcess, String name) {
        super(id, true, name);   
    }

    @Override
    public Contraband findContraband() {
        return null;
    }




}
