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
        if (age >= 24) {
            System.out.println("Ты окончил университет. Пора искать первую работу");
        }
        System.out.println("Задание 3");
        int capasity = 102;
        int sittingPlace = 60;
        int standingPlace = capasity - sittingPlace;
        int sittingPlaceReserved = 52;
        int standingPlaceReserved = 23;
        if (sittingPlaceReserved < sittingPlace) {
            System.out.println("В вагоне осталось свободно " + (sittingPlace - sittingPlaceReserved) + " сидячих мест");
        }
        if (standingPlaceReserved < standingPlace)  {
            System.out.println("В вагоне осталось свбодно " + (standingPlace - standingPlaceReserved) + " стоячих мест");
        }
    }

}