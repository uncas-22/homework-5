public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 5 Часть 1. Задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно немного подождать");
        }
        System.out.println("Часть 1. Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ты еще ходищь в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Ты закончил школу. Отправляйся в университет.");
        }
        if (age >= 24) {
            System.out.println("Ты окончил университет. Пора искать первую работу");
        }
        System.out.println("Часть 1. Задание 3");
        int capasity = 102;
        int sittingPlace = 60;
        int standingPlace = capasity - sittingPlace;
        int sittingPlaceReserved = 52;
        int standingPlaceReserved = 23;
        if (sittingPlaceReserved < sittingPlace) {
            System.out.println("В вагоне осталось свободно " + (sittingPlace - sittingPlaceReserved) + " сидячих мест");
        }
        if (standingPlaceReserved < standingPlace) {
            System.out.println("В вагоне осталось свбодно " + (standingPlace - standingPlaceReserved) + " стоячих мест");
        }
        System.out.println("Часть 2. Задание 1 с использованием else");
        int age2 = 21;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно немного подождать");
        }
        System.out.println("Часть 2. Задание 2 с использованием else");
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ты еще ходищь в школу");
        } else if (age2 >= 18 && age2 < 24) {
            System.out.println("Ты закончил школу. Отправляйся в университет.");
        } else if (age2 >= 24) {
            System.out.println("Ты окончил университет. Пора искать первую работу");
        }
        System.out.println("Часть 2. Задание 3  с использованием else");
        int capasity2 = 102;
        int sittingPlace2 = 60;
        int standingPlace2 = capasity2 - sittingPlace2;
        int sittingPlaceReserved2 = 60;
        int standingPlaceReserved2 = 42;
        if (sittingPlaceReserved2 < sittingPlace2) {
            System.out.println("В вагоне осталось свободно " + (sittingPlace2 - sittingPlaceReserved2) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
            if (standingPlaceReserved2 < standingPlace2) {
                System.out.println("В вагоне осталось свободно " + (standingPlace2 - standingPlaceReserved2) + " стоячих мест");
            } else {
                System.out.println("Стоячих мест нет");
        }
        }
}
