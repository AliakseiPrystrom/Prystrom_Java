import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int scanInt() {
        System.out.println("Введите число");
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static String scanString() {
        System.out.println("Введите имя");
        return scanner.nextLine();
    }

    public static int[] scanIntArray() {
        System.out.println("Введите размерность массива");
        int[] array = new int[scanInt()];
        System.out.println("Заполните массив");
        for (int i = 0; i < array.length; ++i) {
            array[i] = scanInt();
        }
        return array;
    }
}


