
public class Guard extends Person { 
 
    public Guard(String name, int age, String personality, String mood, Space location){
        super(name, age, mood, personality, location);
    }
    public Contraband search(Searcheable s) {
        Contraband contraband = s.findContraband();

        if (contraband != null) {
            contraband.getPrisioner().setContraband(null);
            increaseSentence(contraband.getSeverity(), contraband.getPrisioner());
        }
        return contraband;
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

        prisioner.setsentencetime(extraSentence);
    } 
}
