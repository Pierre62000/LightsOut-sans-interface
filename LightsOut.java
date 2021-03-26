public class LightsOut {
    //attributs
    private Plateau plateau;
    private Integer tour;

    //constructeur

    public LightsOut() {
        this.tour = 0;
    }

    public LightsOut(int hauteur, int largeur) {

    }

    //getter & setter



    //methodes perso

    // Initialise une grille de jeu vide.
    public void initPlateauVide(){

    }

    // Génère un nombre précis de led aléatoirement sur le plateau.
    public void ledRandom(int nbLed){

    }

    // Lance un test de led
    public void ledTest(){

    }

    // Méthode qui permet de choisir une led pour changer son état.
    public void choisirLed(int y, int x){

    }
    // Méthode pour changer l'état d'une led.
    public void changerEtat(int y, int x){

    }
    // Méthode pour changer l'état des led voisines.
    public void changerVoisin(int y, int x){

    }
    // Méthode qui test l'existance des led voisines.
    public void testVoisin(int y, int x){

    }
    // Méthode qui test si le jeu est fini
    // C'est à dire si toute les led sont éteintes.
    public boolean isFini(){
       return false;
    }
    // Méthode qui incrémente le tour de jeu (pour obtenir le nombre de coup joué)
    public void initTour(){
        tour++;
    }

    @Override
    // Méthode pour afficher le jeu (plateau + nb de coup joué)
    public String toString() {
        return "LightsOut{" +
                "plateau=" + plateau +
                ", tour=" + tour +
                '}';
    }
}
