
public class Contraband {
    private boolean findOnInmate;
    private ContrabandSeverity severity;
    private ContrabandType type;
    private Prisioner prisioner;
  
    public void setfindOnInmate(boolean findOnInmate) {
        this.findOnInmate = findOnInmate;
    }

    public boolean getfindOnInmate() {                      // allowing the classes to access the ID//
        return this.findOnInmate;
    }

    public void setseverity(ContrabandSeverity severity) {
        this.severity = severity;
    }

    public ContrabandSeverity getSeverity() {
        return this.severity;
    }

    public void settype(ContrabandType type) {
        this.type = type;
    }

    public ContrabandType gettype() {
        return this.type;
    }

    public void setPrisioner(Prisioner prisioner) {
        this.prisioner = prisioner;
    }

    public Prisioner getPrisioner() {
        return this.prisioner;
    }

    public Contraband(boolean findOnInmate, ContrabandType type, Prisioner prisioner) {
        this.findOnInmate = findOnInmate;
        this.type = type;
        this.prisioner = prisioner;
        this.typeToSeverity();        

        //make random functions to select different types of contraband
    }

    public void typeToSeverity () {
        switch (this.type) {
            case CIGARETTES:
                this.severity = ContrabandSeverity.LIGHT;
            // to do
        }
    }
}




