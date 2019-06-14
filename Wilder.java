class Wilder {

    //attributs
    private String firstname;
    private boolean aware;

    //constructeurs
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = true;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //methodes
    public String whoAmI() {
        if (this.aware == true) {
        return "Je m'appelle " + this.firstname + " et je suis aware" ; // soit on appelle l'attribut 
        }
        else {
        return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware" ; // soit on appelle la méthode
        }
    }

    //getters et setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}    