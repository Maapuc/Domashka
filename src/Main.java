public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        System.out.println("собак " + dog);
        var cat = 3.6;
        System.out.println("кошек " + cat);
        var paper = 763769;
        System.out.println("листов " + paper);

        dog = dog + 4;
        System.out.println("собак стало когда прибавили " + dog);
        cat = cat + 4;
        System.out.println("кошек стало когда прибавили  " + cat);
        paper = paper +4;
        System.out.println("листов стало когда прибавили " + paper);

        dog = dog - 3.5;
        System.out.println("собак стало когда отняли " + dog);
        cat = cat - 1.6;
        System.out.println("кошек стало когда отняли  " + cat);
        paper = paper - 7639;
        System.out.println("листов стало когда отняли " + paper);

        var friend = 19;
        System.out.println("друзей " + friend);
        friend = friend +2;
        System.out.println("друзей стало  "+ friend);
        friend = friend / 7;
        System.out.println("друзей стало " + friend);

        var frog = 3.5;
        System.out.println("лягушек " + frog);
        frog = frog * 10;
        System.out.println("лягушек стало полсле умножения " + frog);
        frog = frog /3.5;
        System.out.println(" лягушек стало полсе деления " + frog);
        frog = frog + 4;
        System.out.println("лягушек стало после сложения " + frog);

        var fighterOneWeight = 78.2;
        var fighterTwoWeight = 82.7;
        var allWeight = fighterOneWeight + fighterTwoWeight;
        System.out.println("общая масса бойцов " + allWeight);
        var deferenceWeightFighter = fighterTwoWeight - fighterOneWeight;
        System.out.println("разница в массе бойцов " + deferenceWeightFighter);

        var remainder = fighterTwoWeight % fighterOneWeight;
        System.out.println("остаток от деления " + remainder);

        var allTime = 640;
        System.out.println("общее время работы " + allTime + " часов ");
        var workerTime = 8;
        System.out.println("время работы одним рабаотником " + workerTime + " часов ");
        var allWarker = allTime / workerTime;
        System.out.println("всего работников в компании " + allWarker + " работников ");

        allWarker = allWarker + 94;
        System.out.println("всего работников в компании " + allWarker + " работников ");
        var newAllTime = workerTime * allWarker;
        System.out.println("если в компании рабоатет " + allWarker +" человек , то всего " + newAllTime + " часов может быть поделено между сотрудниками " );

    }
}