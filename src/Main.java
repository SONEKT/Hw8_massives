import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задча 1");
        int[] numbers = new int[]{1, 2, 3};
        double[] parts = {1.57, 7.654, 9.986};
        int[] random = {1, 2, 3, 4, 5, 99};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[]{1, 2, 3};
        double[] parts = {1.57, 7.654, 9.986};
        int[] random = {1, 2, 3, 4, 5, 99};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i]);

            if (i < random.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[]{1, 2, 3};
        double[] parts = {1.57, 7.654, 9.986};
        int[] random = {1, 2, 3, 4, 5, 99};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);

            if (i >= 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = parts.length - 1; i >= 0; i--) {
            System.out.print(parts[i]);

            if (i >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(random[i]);

            if (i >= 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0){
                numbers[i] ++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}