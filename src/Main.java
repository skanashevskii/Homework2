public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
     var firstBoxerWeight = 78.2;
     var secondBoxerWeight = 82.7;

     var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalBoxersWeight);
     var weightDifferenceBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifferenceBoxers);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
     var firstBoxerWeight = 78.2;
     var secondBoxerWeight = 82.7;

     var weightDifferenceBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница весов боксеров вариант 1 - " + weightDifferenceBoxers);

        weightDifferenceBoxers = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница весов боксеров вариант 2 - " + weightDifferenceBoxers);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
     var totalEmploeesHours = 640;
     var employeeDailyWorkingHours = 8;
     var totalWokers = totalEmploeesHours/employeeDailyWorkingHours;
        System.out.println("Всего работников в компании - " + totalWokers);
        totalWokers = totalWokers + 94;
        totalEmploeesHours = totalWokers*employeeDailyWorkingHours;
        System.out.println("Если в компании работает " + totalWokers + " человек,то всего "
                + totalEmploeesHours + " часов часов работы может быть поделено между сотрудниками.");




    }
}