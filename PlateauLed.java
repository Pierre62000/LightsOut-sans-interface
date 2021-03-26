public class PlateauLed extends Plateau {

    /**
     *
     * @param hauteur
     * @param largeur
     */
    public PlateauLed(int hauteur, int largeur){
        grille = new CaseLed[hauteur][largeur];
    }
}
