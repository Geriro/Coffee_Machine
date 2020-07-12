import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        boolean res = true;
        while (scanner.hasNext()) {
            String tmp2 = scanner.next();
            if (tmp.compareTo(tmp2) > 0) {
                res = false;
                break;
            } else if (!scanner.hasNext())  {
                break;
            } else {
                tmp = tmp2;
            }

        }
        System.out.println(res);

    }



}