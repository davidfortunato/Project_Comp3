import java.util.ArrayList;
import java.util.List;

public class Guard extends Person { 
 
    // Guard is dirty if random > 0.5
    private boolean isDirty = this.randomThreshold();
    private List<Contraband> contrabandStolen = new ArrayList<Contraband>();

    public Guard(String name, int age, String personality, String mood, Space location){
        super(name, age, mood, personality, location);
        System.out.println(String.format("New guard %s: %s", this.getName(), this.isDirty ? "is dirty" : "is not dirty"));
    }

    public Contraband search(Searcheable s) {
        Contraband contraband = s.findContraband();

        if (contraband != null) {
            if (this.isDirty) {
                this.stealContraband(contraband);
            }

            contraband.getPrisioner().setContraband(null);
            increaseSentence(contraband.getSeverity(), contraband.getPrisioner());
        }
        return contraband;
    }

    public void stealContraband(Contraband contraband) {
        this.contrabandStolen.add(contraband);
        System.out.println(String.format("Dirty guard %s: stole %s", this.getName(), contraband.toString()));
    }

    public void increaseSentence(ContrabandSeverity severity, Prisioner prisioner) {
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

        prisioner.setSentenceTime(extraSentence);
        System.out.println(String.format("Guard %s increased prisioner %s sentence by %d years", this.toString(), prisioner.getName(), extraSentence));
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
