import java.util.ArrayList;
import java.util.List;

public class Prisioner extends Person implements Searcheable {
    private String  crime;
    private String  foodPreference;
    private Space  jobPreference;
    private Space  sportsPreference;
    private boolean alergies;
    private int sentenceTime;
    private double moneyBalance;
    private Contraband contraband;
    private List<Space> notAllowed = new ArrayList<Space>();
    private Space cellBlock;

    private final int WRESTLE_EXTRA_SENTENCE = 3;
    private final int ROB_EXTRA_SENTENCE = 2;
 
    public Prisioner(String name, String crime, int age, String personality, String mood, String foodPreference, Space jobPreference, Space sportsPreference, boolean alergies, int sentenceTime, Contraband contraband, double moneyBalance, Space location, Room cellBlock ){
        super(name, age, personality, mood, location);
        this.crime = crime;
        this.foodPreference = foodPreference;
        this.jobPreference = jobPreference;
        this.sportsPreference = sportsPreference;
        this.alergies = alergies;
        this.sentenceTime = sentenceTime;
        this.moneyBalance = moneyBalance;
        this.contraband = contraband;
        this.cellBlock = cellBlock;
    }

    public void addNotAllowed(Space s) {
        this.notAllowed.add(s);
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getrime() {                      // allowing the classes to access the ID//
        return this.crime;
    }

    public void setfoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getfoodPreference() {                      // allowing the classes to access the parameter//
        return this.foodPreference;
    }

    public void setjobPreference(Room jobPreference) {
        this.jobPreference = jobPreference;
    }

    public Space getjobPreference() {                      // allowing the classes to access the parameter//
        return this.jobPreference;
    }

    public void setsportsPreference(Room sportsPreference) {
        this.sportsPreference = sportsPreference;
    }

    public Space getsportsPreference() {                      // allowing the classes to access the parameter//
        return this.sportsPreference;
    }

    public void setalergies(boolean alergies) {
        this.alergies = alergies;
    }

    public boolean getalergies() {                      // allowing the classes to access the parameter//
        return this.alergies;
    }


    public void setSentenceTime(int sentenceTime) {
        this.sentenceTime = sentenceTime;
    }

    public int getSentenceTime() {                      // allowing the classes to access the parameter//
        return this.sentenceTime;
    }

    public void addSentenceTime (int extraSentenceTime) {
        this.sentenceTime += extraSentenceTime;
        System.out.println(String.format("Prisioner %s: new sentence time is %d years", this.getName(), this.getSentenceTime()));
    }

    public void addMoneyBalance(double balanceToAdd) {
        this.setMoneyBalance(this.moneyBalance + balanceToAdd);
    }

    public void setContraband(Contraband contraband) {
        this.contraband = contraband;
        System.out.println(String.format("Prisioner %s: contraband is now %s", this.getName(), this.contraband == null ? "empty" : contraband.toString()));
    }

    public Contraband getContraband() {
        return this.contraband;
    }

    public void setMoneyBalance(Double moneyBalance) {
        this.moneyBalance = moneyBalance;
        System.out.println(String.format("Prisioner %s: new money balance is %f", this.getName(), this.getMoneyBalance()));
    }

    public double getMoneyBalance() {
        return this.moneyBalance;
    }

    public Contraband findContraband() {
        return this.contraband;
    }

    public Space getCellBlock() {
        return this.cellBlock;
    }

    public void setCellBlock(Room cellBlock) {
        this.cellBlock = cellBlock;
        System.out.println(String.format("Prisioner %s: new cell block %s", this.getName(), this.cellBlock.getName()));
    }

    public void wrestle(Prisioner prisioner, Room newCellBlock, List<Space> prisonMap, Space infirmary) {
        System.out.println(String.format("Prisioners %s and %s are fighting...", this.getName(), prisioner.getName()));
        this.addSentenceTime(this.WRESTLE_EXTRA_SENTENCE);
        prisioner.addSentenceTime(this.WRESTLE_EXTRA_SENTENCE);

        if (this.cellBlock == prisioner.getCellBlock()) {
            this.setCellBlock(newCellBlock);
        }

        this.walk(infirmary, prisonMap);
        prisioner.walk(infirmary, prisonMap);
    }


    @Override
    public void walk(Space end, List<Space> prisionMap) {
        System.out.println(String.format("Prisioner %s: Walking from %s to %s...", this.getName(), this.getLocation().getName(), end.getName()));

        List<Space> path = Dijkstra.shortestPath(this.getLocation(), end, prisionMap, this);

        System.out.println(String.format("Prisioner %s: Using path %s", this.getName(), path.toString()));

        this.setLocation(end);

        System.out.println(String.format("Prisioner %s: Reached destination (%s)", this.getName(), this.getLocation().toString()));
    }

    public void rob(Prisioner robbed) {
        System.out.println(String.format("Prisioner %s: Robbing %s...", this.getName(), robbed.getName()));

        if (this.getLocation() != robbed.getLocation()) {
            System.out.println(String.format("Prisioner %s: Can't rob - not in the same location", this.getName()));
            return;
        }

        // Successfully steals if random > 0.5
        if (this.randomThreshold()) {
            this.addMoneyBalance(robbed.getMoneyBalance());
        } else {
            this.addSentenceTime(this.ROB_EXTRA_SENTENCE);
        }

        robbed.setMoneyBalance(0.0);
    } 


    @Override
    public boolean allowedToVisitSpace(Space s) {
        return !this.notAllowed.contains(s);
    }
}

