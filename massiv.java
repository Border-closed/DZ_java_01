// Создать массив, длиной х, каждый элемент из которого равен введенному слову от пользователя

import java.util.Scanner;
import java.util.Arrays;
public class massiv {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите слово: ");
        String s = iScanner.nextLine();
        Scanner iScanner1 = new Scanner (System.in);
        System.out.print("Введите длину массива: ");
        int x = iScanner1.nextInt();
        iScanner.close();
        iScanner1.close();
        String [] arr = new String [x];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s;
        }
        System.out.print(Arrays.deepToString(arr));
    }
}
