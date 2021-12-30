import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guard extends Person { 
 
    // Guard is dirty if random > 0.5
    private boolean isDirty = this.randomThreshold();
    private List<Contraband> contrabandStolen = new ArrayList<Contraband>();

    public Guard(String name, int age, String personality, String mood, Space location){
        super(name, age, mood, personality, location);
        System.out.println(String.format("New guard %s: %s", this.getName(), this.isDirty ? "is dirty" : "is not dirty"));
    }

    public Contraband search(Scanner input, Prison prison) {

        System.out.println("ACTION: Robbing prisioner");
        String searchedPrisioner = input.nextLine();
        Prisioner searched = prison.getPrisioner(searchedPrisioner);

        Contraband contraband = searched.findContraband();
        System.out.println(String.format("Guard %s searched prisioner %s and found %s", this.getName(), searched.getName(), contraband.toString()));


        if (contraband != null) {
            if (this.isDirty) {
                this.stealContraband(contraband);
            }

            contraband.getOwner().setContraband(null);
            this.increaseSentence(contraband.getSeverity(), contraband.getOwner());   //preciso de ajuda
            contraband.setOwner(null);
        }
        return contraband;
    }

    public void stealContraband(Contraband contraband) {
        this.contrabandStolen.add(contraband);
        System.out.println(String.format("Dirty guard %s: stole %s", this.getName(), contraband.toString()));
    }

    public void increaseSentence(ContrabandSeverity severity, Person owner) {
        int extraSentence = 0;

        switch (severity) {
            case LIGHT:
                extraSentence = 1;
                break;
            case MEDIUM:
                extraSentence = 2;
                break;
            case SEVERE:
                extraSentence = 3;
                break;
        }
        if(! (owner instanceof Guard)) return;

        ((Prisioner) owner).setSentenceTime(extraSentence);
        System.out.println(String.format("Guard %s increased prisioner %s sentence by %d years", this.toString(), owner.getName(), extraSentence));
    }

    @Override
    public boolean allowedToVisitSpace(Space s) {
        return true;
    }

    @Override
    public void walk(Space end, List<Space> prisionMap) {
       return;
    }
}
