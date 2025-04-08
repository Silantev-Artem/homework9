import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        int[] payments = {10000, 2000, 15000, 3500, 2500};
        int total = 0;
        for (int weekPayment : payments) {
            total += weekPayment;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");


        System.out.println("\nЗадание 2");

        int maxPayment = payments [0];
        int minPayment = payments [0];
        for (int current : payments) {
            if (current > maxPayment) {
                maxPayment = current;
            }
            if (current < minPayment){
                minPayment = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");


        System.out.println("\nЗадание 3");

        double totalNew = 0;
        for (int weekPayment : payments) {
            totalNew += weekPayment;
        }
        double averagePayments = (totalNew / payments.length);

        System.out.println("Средняя сумма трат за месяц составила "+ averagePayments + " рублей" );

        System.out.println("\nЗадание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = 0; i < reverseFullName.length / 2; i++) {
            int temporary = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName [reverseFullName.length - i - 1] = (char)temporary;
        }
        System.out.println(reverseFullName);



    }
}