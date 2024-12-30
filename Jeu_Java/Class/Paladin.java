public class Paladin extends Combattant {

    public Paladin(){}
    public Paladin(String firstname,String lastname, int lifePoints, int magicPoints, int att, int def, String arme, String armure,String nargue){
        super(firstname, lastname, lifePoints, magicPoints, att, def, arme, armure, nargue);
    }

    @Override
    public String toString(){
        return "Bonjour, les statistiques de ce Paladin sont : \n" +
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
