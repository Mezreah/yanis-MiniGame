public class Personnage {

    protected String firstname;
    protected String lastname;
    protected int lifePoints;
    protected int magicPoints;
    protected int att;
    protected int def;
    protected String arme;
    protected String armure;
    protected String nargue;
    protected String fuite;

    public Personnage(){
        this.firstname= "Null";
        this.lastname="Null";
        this.lifePoints = 0;
        this.magicPoints = 0;
        this.att = 0;
        this.def = 0;
        this.arme = "null";
        this.armure="null";
        this.nargue="null";
        this.fuite = "null";
    }

    public Personnage(String firstname,String lastname,int lifePoints,int magicPoints,int att,int def,String arme,String armure, String nargue){
        this.firstname = firstname;
        this.lastname =lastname;
        this.lifePoints = lifePoints;
        this.magicPoints = magicPoints;
        this.att = att;
        this.def = def;
        this.arme = arme;
        this.armure = armure;
        this.nargue = nargue;
    }

    public String getFirstname (){return this.firstname;}
    public String getLastname(){return this.lastname;}
    public int getPV(){return this.lifePoints;}
    public int getPM(){return this.magicPoints;}
    public int getAtt(){return this.att;}
    public int getDef(){return this.def;}
    public String getArme(){return this.arme;}
    public String getArmure(){return this.armure;}
    public String getNargue(){return this.nargue;}

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setLastname (String lastname){this.lastname = lastname;}
    public void setPV (int lifePoints){this.lifePoints = lifePoints;}
    public void setPM (int magicPoints){this.magicPoints = magicPoints;}
    public void setAtt (int attaque){this.att=attaque;}
    public void setDef(int defense){this.def = defense;}
    public void setArmure(String armure){this.armure = armure;}
    public void setArme(String arme){this.arme = arme;}
    public void setNargue(String nargue){this.nargue = nargue;}


    @Override
    public String toString(){
        return "Bonjour, les statistiques de ce personnages sont : \n" +
                "Prénom : " + getFirstname() + "\n"+
                "Nom : " + getLastname() + "\n" +
                "Ses PV sont initialisés à : " + getPV() + "\n" +
                "Ses PM sont initalisés à : " + getPM() + "\n" +
                "Son attaque est à : " + getAtt() + "\n" +
                "Sa défense est à : " + getDef() + "\n" +
                "Son arme est un.e : " + getArme() + "\n" +
                "Son armure est un.e : " + getArmure() + "\n" +
                "Sa nargue est : " + getNargue() + "\n";

    }
}
