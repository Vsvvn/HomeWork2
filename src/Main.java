public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача № 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача № 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача № 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача № 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача № 6");
        var wightBoxer1 = 78.2;
        var wightBoxer2 = 82.7;
        var totalWeightOfBoxers = wightBoxer1 + wightBoxer2;
        System.out.println("Общий вес двух бойцов составляет " + totalWeightOfBoxers + " кг!");
        var differenceWeightOfBoxers = wightBoxer2 - wightBoxer1;
        System.out.println("Разница в весе между двумя бойцами " + differenceWeightOfBoxers + " кг!");

        System.out.println("Задача № 7");
        var differenceWeightOfBoxers1 = wightBoxer2 - wightBoxer1;
        System.out.println("Разница в весе между двумя бойцами " + differenceWeightOfBoxers1 + " кг!" + " (Использовано вычитание)");
        var differenceWeightOfBoxers2 = wightBoxer2 % wightBoxer1;
        System.out.println("Разница в весе между двумя бойцами " + differenceWeightOfBoxers2 + " кг!" + " (Использован остаток от деления)");

        System.out.println("Задача № 8 (1)");
        var totalWorkingHoursEmployees = 640;
        System.out.println("Общее количество рабочих часов сотрудников " + totalWorkingHoursEmployees + ".");
        var oneEmployeesHours = 8;
        System.out.println("Один сотрудник посвящает работе " + oneEmployeesHours + " часов.");
        var numberOfEmployees = totalWorkingHoursEmployees / oneEmployeesHours;
        System.out.println("Всего работников в компании – " + numberOfEmployees + " человек.");

        System.out.println("Задача № 8 (2)");
        numberOfEmployees = numberOfEmployees + 94;
        totalWorkingHoursEmployees = numberOfEmployees * oneEmployeesHours;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalWorkingHoursEmployees + " часов работы может быть поделено между сотрудниками");
    }
}