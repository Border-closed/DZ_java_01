import java.util.Scanner;
public class print {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите строку: ");
        String s = iScanner.nextLine();
        Scanner iScanner1 = new Scanner (System.in);
        System.out.print("Введите количество повторов: ");
        int x = iScanner1.nextInt();
        iScanner.close();
        iScanner1.close();
        for (int i = 0; i < x; i++) {
            System.out.println(s);
        }
    }
}
