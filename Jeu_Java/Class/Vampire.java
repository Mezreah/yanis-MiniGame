public class Vampire extends Monstre{
    public Vampire(){}

    public Vampire(String firstname, String lastname, int lifePoints, int att, int def,String Type_elementaire, String capacite_special){
        super(firstname,lastname,lifePoints,att,def,Type_elementaire,capacite_special);
    }

    @Override
    public String toString(){
        return "Bonjour, les statistiques de ce vampire sont : \n" +
                "Prénom : " + getFirstname() + "\n"+
                "Nom : " + getLastname() + "\n" +
                "Ses PV sont initialisés à : " + getLifePoints() + "\n" +
                "Son attaque est à : " + getAtt() + "\n" +
                "Sa défense est à : " + getDef() + "\n" +
                "Son type est de : " + getType_elementaire() + "\n" +
                "Sa capacité spéciale est  : " + getCapacite_special() + "\n";
    }
}


