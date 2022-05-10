import java.util.Collections;

public class Main {
    private static int i;

    public static void main(String[] args) {
        int[] book = generateRandomArray();
    }

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] book = new int[30];
            int sum = 0;
            for (int i = 0; i < book.length; i++) {
                book[i] = random.nextInt(100_000) + 100_000;
                sum = sum + book[i];
            }
            //Задание 1
            System.out.println("Сумма трат за месяц составила " + sum + "  рублей.");

            //Задание 2
            int max = book[0];
            for (int i = 1; i < book.length; i++) max = Math.max(max, book[i]);
            int min = book[0];
            for (int num : book) {
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

            //Задание 3
            float average = 0;
            if (book.length > 0) {
                float sUm = 0;
                for (int i = 0; i < book.length; i++) {
                    sUm += book[i];
                }
                average = sUm / book.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


            //Задание 4
             char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
             for (int i = reverseFullName.length-1; i>=0; i--){
                 System.out.print(reverseFullName[i]);
             }
             return book;
        }
}
