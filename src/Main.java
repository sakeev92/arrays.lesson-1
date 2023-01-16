import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Первый массив");
        int[] numbers1 = new int[3];
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = i + 1;
            System.out.println(numbers1[i]);
        }
        System.out.println("Второй массив");
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.println("Третий массив");
        char[] numbers3 = {'a', 'b', 'c'};
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Первый массив");
        int[] numbers1 = new int[3];
        {
            for (int i = 0; i < numbers1.length; i++) {
                numbers1[i] = i + 1;
                System.out.print(numbers1[i]);
                if (i < numbers1.length - 1) {
                    System.out.print(", ");

                }
            }

            System.out.println();
            System.out.println("Второй массив");
            double[] numbers2 = {1.57, 7.654, 9.986};
            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i]);
                if (i < numbers2.length - 1) {
                    System.out.print(", ");

                }
            }
            System.out.println();
            System.out.println("Третий массив");
            char[] numbers3 = {'a', 'b', 'c'};
            for (int i = 0; i < numbers3.length; i++) {
                System.out.print(numbers3[i]);
                if (i < numbers3.length - 1) {
                    System.out.print(", ");

                }
            }
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Первый массив");
        int[] numbers1 = new int[3];
        {
            for (int i = numbers1.length - 1; i >= 0; i--) {
                numbers1[i] = i + 1;
                System.out.print(numbers1[i] + " ");
                if (i != 0) {
                    System.out.print(", ");

                }
            }

            System.out.println();
            System.out.println("Второй массив");
            double[] numbers2 = {1.57, 7.654, 9.986};
            for (int i = numbers2.length - 1; i >= 0; i--) {
                System.out.print(numbers2[i]);
                if (i != 0) {
                    System.out.print(", ");

                }
            }
            System.out.println();
            System.out.println("Третий массив");
            char[] numbers3 = {'a', 'b', 'c'};
            for (int i = numbers3.length - 1; i >= 0; i--) {
                System.out.print(numbers3[i]);
                if (i != 0) {
                    System.out.print(", ");

                }
            }
            System.out.println();
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] % 2 != 0)  {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}






