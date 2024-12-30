public class Monstre {

    protected String firstname;
    protected String lastname;
    protected int lifePoints;
    protected int att;
    protected int def;
    protected String type_elementaire;
    protected String capacite_special;


    public Monstre(){
        this.firstname = "Null";
        this.lastname = "Null";
        this.lifePoints = 0;
        this.att = 0;
        this.def = 0;
        this.type_elementaire = "Null";
        this.capacite_special="Null";
    }

    public Monstre(String firstname,String lastname,int lifePoints,int att, int def, String type_elementaire, String capacite_special){
        this.firstname = firstname;
        this.lastname = lastname;
        this.lifePoints = lifePoints;
        this.att = att;
        this.def = def;
        this.type_elementaire = type_elementaire;
        this.capacite_special = capacite_special;
    }

    public String getFirstname(){return this.firstname;}
    public String getLastname(){return this.lastname;}
    public int getLifePoints(){return this.lifePoints;}
    public int getAtt(){return this.att;}
    public int getDef(){return this.def;}
    public String getType_elementaire(){return this.type_elementaire;}
    public String getCapacite_special(){return this.capacite_special;}

    public void setFirstname(String firstname){this.firstname=firstname;}
    public void setLastname(String lastname){this.lastname=lastname;}
    public void setLifePoints(int lifePoints){this.lifePoints=lifePoints;}
    public void setAtt(int att) {this.att = att;}
    public void setDef(int def){this.def = def;}

    public void setCapacite_special(String capacite_special) {this.capacite_special = capacite_special;}

    public void setType_elementaire(String type_elementaire) {this.type_elementaire = type_elementaire;}

    @Override
    public String toString(){
        return "Bonjour, les statistiques de ce Monstre sont : \n" +
                "Prénom : " + getFirstname() + "\n"+
                "Nom : " + getLastname() + "\n" +
                "Ses PV sont initialisés à : " + getLifePoints() + "\n" +
                "Son attaque est à : " + getAtt() + "\n" +
                "Sa défense est à : " + getDef() + "\n" +
                "Son type est de : " + getType_elementaire() + "\n" +
                "Sa capacité spéciale est  : " + getCapacite_special() + "\n";
    }
}
