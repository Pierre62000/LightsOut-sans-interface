import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        choisirCases();
    }

    // Choisir les dimensions du plateau
    public static void choisirCases(){
        int hauteur;
        int largeur;
        Scanner input = new Scanner(System.in);
        System.out.println("Combien de cotés voulez-vous ?");
        System.out.println("hauteur : ");
        hauteur = input.nextInt();
        System.out.println("largeur : ");
        largeur = input.nextInt();
        new LightsOut(hauteur,largeur);
    }
}
