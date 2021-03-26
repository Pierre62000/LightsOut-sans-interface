import java.util.Arrays;

public abstract class Plateau {
    //attributs
    protected Case[][] grille;


    //getter & setter

    //methodes perso


    @Override
    public String toString() {
        return "Plateau{" +
                "grille=" + Arrays.toString(grille) +
                '}';
    }

    /**
     * Retourner une chaine de caractère représentant le plateau.
     * @return
     */
    public String afficherPlateau(){
        return toString();
    }
}
