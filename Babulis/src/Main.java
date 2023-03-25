import java.util.Scanner;

public class Main {
    //    1 Программа «Бабуля».
//    Дана температура.
//    Если она отрицательная, выведите предупреждающее сообщение для пользователя,
//    чтобы тот надел шапку.
//    2 Дан номер дня недели. Выведите название дня недели.
//    3 Дано два числа. Выведите на экран максимальное из них, используя if.
    public static void main(String[] args) {
        System.out.println("Введите температуру воздуха!");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 0) {
            System.out.println("Надень шапку");
            System.out.println("Введите номер дня недели, плиз: ");
            int dayNumber = scanner.nextInt();
            if (dayNumber < 1 || dayNumber > 7) {
                System.out.println("Номер дня недели должен быть от 1 до 7");
                return;
            }
            if (dayNumber == 1)
        }
        System.out.println("Пн.");
        if (dayNumber == 2)
    }
                System.out.println("Вт.");
                    if(dayNumber ==3)
}
                System.out.println("Ср.");
                        if (dayNumber == 4 ){
                System.out.println("Чт.");
                            if (dayNumber == 5 ){
                System.out.println("Пт.");
                                if (dayNumber == 6 ){
                System.out.println("Сб.");
                                    if (dayNumber == 7 ){
                System.out.println("Вс.");
        }

    }
