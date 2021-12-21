public abstract class Person {
    private String name;
    private int age;
    private String mood;
    private String personality;
    private Space location;

    public Person (String name, int age, String mood, String personality, Space location) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.personality = personality;
        this.location = location;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {                      // allowing the classes to access the parameter//
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {                      // allowing the classes to access the ID//
        return this.age;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    public String getMood() {                      // allowing the classes to access the parameter//
        return this.mood;
    }
    
    public void setPersonality(String personality) {
        this.personality = personality;
    }
    
    public String getPersonality() {                      // allowing the classes to access the parameter//
        return this.personality;
    }

    public void setLocation(Space location) {
        this.location = location;
    }
    
    public Space getLocation() {                      // allowing the classes to access the parameter//
        return this.location;
    }
}