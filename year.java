// Проверить год високосный или нет
// Принцип:
// Год делится на 400 -> високосный
// Год делится на 100 -> не високосный
// Год делится на 4 -> високосный
// Год не високосный

import java.util.Scanner;
public class year {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();
        iScanner.close();
        if (year%400==0){
            System.out.println(year + " високосный год");
        }
        if (year%100==0) {
            System.out.println(year + " не високосный год");
        }
        if (year%4==0) {
            System.out.println(year + " високосный год");
        }
        else{
            System.out.println(year + " не високосный год");
        }
    }
}
