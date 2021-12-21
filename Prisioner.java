public class Prisioner extends Person implements Searcheable {
    private String  crime;
    private String  foodPreference;
    private String  jobPreference;
    private String  sportsPreference;
    private boolean alergies;
    private int sentenceTime;
    private double moneyBalance;
    private Contraband contraband;
    
 
    public Prisioner(String name, String crime, int age, String personality, String mood, String foodPreference, String jobPreference, String sportsPreference, boolean alergies, int sentenceTime, Contraband contraband, double moneyBalance, Space location){
        super(name, age, personality, mood, location);
        this.crime = crime;
        this.foodPreference = foodPreference;
        this.jobPreference = jobPreference;
        this.sportsPreference = sportsPreference;
        this.alergies = alergies;
        this.sentenceTime = sentenceTime;
        this.moneyBalance = moneyBalance;
        this.contraband = contraband;
    }

    public void setcrime(String crime) {
        this.crime = crime;
    }

    public String getcrime() {                      // allowing the classes to access the ID//
        return this.crime;
    }

    public void setfoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getfoodPreference() {                      // allowing the classes to access the parameter//
        return this.foodPreference;
    }

    public void setjobPreference(String jobPreference) {
        this.jobPreference = jobPreference;
    }

    public String getjobPreference() {                      // allowing the classes to access the parameter//
        return this.jobPreference;
    }


    public void setsportsPreference(String sportsPreference) {
        this.sportsPreference = sportsPreference;
    }

    public String getsportsPreference() {                      // allowing the classes to access the parameter//
        return this.sportsPreference;
    }

    public void setalergies(boolean alergies) {
        this.alergies = alergies;
    }

    public boolean getalergies() {                      // allowing the classes to access the parameter//
        return this.alergies;
    }


    public void setsentencetime(int sentenceTime) {
        this.sentenceTime = sentenceTime;
    }

    public int getsentencetime() {                      // allowing the classes to access the parameter//
        return this.sentenceTime;
    }

    public void addSentenceTime (int extraSentenceTime) {
        this.sentenceTime += extraSentenceTime;
    }

    public void setContraband(Contraband contraband) {
        this.contraband = contraband;
    }

    public Contraband getContraband() {
        return this.contraband;
    }

    public void setmoneyBalance(Double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public double getmoneyBalance() {
        return this.moneyBalance;
    }

    public Contraband findContraband() {
        return null;
    } 
}
