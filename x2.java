//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class x2 {
    public static void main (String[] args) {
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }
        System.out.println();
        System.out.print("Измененный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

