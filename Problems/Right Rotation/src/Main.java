import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);
        int rotate = scanner.nextInt();
        if (rotate > tab.length) {
            rotate = rotate % tab.length;

        }
        int[] tabfi = new int[tab.length];
        int j = rotate;
        int pos = rotate - 1;
        for (int i = tab.length - 1; i >= tab.length - rotate; i--) {
            tabfi[pos] = tab[i];
            pos--;
        }
        for (int i = 0; i < tab.length - rotate; i++){
            tabfi[j] = tab[i];
            j++;
        }
        for (int i = 0; i < tabfi.length; i++) {
            System.out.print(tabfi[i] + " ");
        }

    }

    public static int[] remplissage(Scanner scanner) {

        String[] entrance = scanner.nextLine().split(" ");

        int[] tab = new int[entrance.length];
        for (int i = 0; i < entrance.length; i++) {
            tab[i] = Integer.parseInt(entrance[i]);
        }

        return tab;

    }
}