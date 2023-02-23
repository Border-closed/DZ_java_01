// Проверить, что введенное число Х положительное

import java.util.Scanner;
public class positiv {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите число Х: ");
        int x = iScanner.nextInt();
        iScanner.close();
        if (x>0){
            System.out.println("Число "+x + " положительное");
        }
        else {
            System.out.println("Число "+x + " отрицательное");
        }
    }
}


