import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);



        int longueurMax = 0;
        int longueurTmp = 0;
        int numTmp = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > numTmp) {
                longueurTmp++;
                numTmp = tab[i];
            } else {
                if (longueurMax < longueurTmp) {
                    longueurMax = longueurTmp;
                }
                longueurTmp = 1;
                numTmp = tab[i];
            }

        }

        System.out.println(longueurMax > longueurTmp ? longueurMax : longueurTmp);

    }

    public static int[] remplissage(Scanner scanner) {
        int taille = scanner.nextInt();
        int[] tab = new int[taille];



        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        return tab;



    }
}