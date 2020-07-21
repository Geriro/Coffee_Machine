import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbCorp = scanner.nextInt();
        int[] tabIncome = remplissageIncome(scanner, nbCorp);
        int[] tabTaxes = remplissageTaxes(scanner, nbCorp);
        float max = Float.MIN_VALUE;
        int number = 0;

        for (int i = 0; i < nbCorp; i++) {

            if(tabIncome[i] != 0 && tabTaxes[i] != 0) {
                float resultat = (float)tabIncome[i] * (float)tabTaxes[i] / (float)100;

                if (resultat > max) {
                    max = resultat;
                    number = i + 1;
                }
            }

        }

        System.out.println(number);


    }

    public static int[] remplissageIncome(Scanner scanner, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }

    public static int[] remplissageTaxes(Scanner scanner, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
}