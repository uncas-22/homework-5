public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 5 Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        int age2 = 17;
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно немного подождать");
        }
        System.out.println("Задание 2");
        int ageSchool = 7;
        if (ageSchool >= 7) {
            System.out.println("Ты еще ходищь в школу");
        }
        int ageUniversity = 18;
        if (ageUniversity >= 18) {
            System.out.println("Ты закончил школу. Отправляйся в университет.");
        }
        int ageWork = 24;
        if (ageWork >=24) {
            System.out.println("Ты окончил университет. Пора искать первую работу");
        }
    }
}