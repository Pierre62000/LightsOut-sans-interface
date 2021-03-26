public class CaseLed extends Case{
    //attributs

    private boolean estAllumée;

    //constructeur

    /**
     * Constructeur par défaut de la classe Led.
     * La valeur estAllumée est automatiquement initialisée à false.
     */
    public CaseLed() {
        this.estAllumée = false;
    }

    /**
     * Methode de construction des objets de type Case
     * @param estAllumée correspond à la valeur déterminé de la case
     */
    public CaseLed(boolean estAllumée) {
        this.estAllumée = estAllumée;
    }

    //getter & setter
    public boolean isEstAllumée() {
        return estAllumée;
    }
    public void setEstAllumée(boolean estAllumée) {
        this.estAllumée = estAllumée;
    }


    //methodes perso

    /**
     * Methode permettant de passer une case d'un état à l'autre. (allumée/true et éteinte/false)
     */
    public void changerEtat() {
        estAllumée = !estAllumée;
    }

    @Override
    public String toString() {
        return "CaseLed{" +
                "estAllumée=" + estAllumée +
                '}';
    }
}
