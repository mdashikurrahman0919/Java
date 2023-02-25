import java.util.Scanner;

public class EliminateDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please Enter Ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctNumbers = new int[list.length];
        int count = 0;
        for (int num : list) {
            if (!contains(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = distinctNumbers[i];
        }

        return result;
    }

    public static boolean contains(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}
