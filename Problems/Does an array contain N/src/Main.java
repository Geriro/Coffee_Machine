import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);

        int n = scanner.nextInt();


        boolean res = false;
        for (int val : tab) {
            if (val == n) {
                res = true;
            }
        }



        System.out.println(res ? "true" : "false");

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