public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 5 Задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно немного подождать");
        }
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ты еще ходищь в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Ты закончил школу. Отправляйся в университет.");
        }
        if (age >=24) {
            System.out.println("Ты окончил университет. Пора искать первую работу");
        }
    }
}