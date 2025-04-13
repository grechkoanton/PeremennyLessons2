public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte apple = 3;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        short bananas = 10;
        System.out.println("Значение переменной bananas с типом short равно " + bananas);
        int orange = 50;
        System.out.println("Значение переменной orange с типом int равно " + orange);
        long allFruit = 63L;
        System.out.println("Значение переменной allFruit с типом long равно " + allFruit);
        float number = 1.12f;
        System.out.println("Значение переменной number с типом float равно " + number);
        double numberTwo = 7.14;
        System.out.println("Значение переменной numberTwo с типом double равно " + numberTwo);
        System.out.println();
        // Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;
        // Задача 3
        int allPaper = 480;
        int students1 = 23;
        int students2 = 27;
        int students3 = 30;
        int allStudents = students1 + students2 + students3;
        int paperOnePerson = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + paperOnePerson + " листов бумаги");
        System.out.println();
        // Задача 4
        int minutes2 = 16;
        int minutes1 = minutes2/2;
        int minutes20 = minutes1 * 20;
        int day1 = 60 * 24 * minutes1;
        int day3 = day1 * 3;
        int month = day1 * 30;
        System.out.printf("За 20 минут машина произвела %d штук бутылок\nЗа сутки машина произвела %d штук бутылок\nЗа 3 дня машина произвела %d штук бутылок\nЗа 1 месяц машина произвела %d штук бутылок\n", minutes20, day1, day3, month);
        System.out.println();
        // Задача 5
        byte needWhiteBrown = 120;
        byte class1White = 2;
        byte class1Brown = 4;
        byte class1WhiteBrown = (byte) (class1White + class1Brown);
        byte allClassInSchool = (byte) (needWhiteBrown / class1WhiteBrown);
        short allWhiteInSchool = (short) (allClassInSchool * class1White);
        short allBrownInSchool = (short) (allClassInSchool * class1Brown);

        System.out.println("В школе, где " + allClassInSchool + " классов, нужно " + allWhiteInSchool + " банок белой краски и " + allBrownInSchool +" банок коричневой краски");
        System.out.println();
        // Задача 6
        int bananas1 = 5;
        int gramBananas1 = 80;
        int bananasAllGram = bananas1 * gramBananas1;
        int milkMil = 200;
        int milkMil100Gram = 105;
        int milkAllGram = milkMil / 100 * milkMil100Gram;
        int iceCreamBricet1 = 2;
        int iceCreamBricet2Gram = 100;
        int iceCreamBricetAllGram = iceCreamBricet1 * iceCreamBricet2Gram;
        int eggs = 4;
        int eggs1Gram = 70;
        int eggsAllGram = eggs * eggs1Gram;
        int sportBreakfastGram = bananasAllGram + milkAllGram + iceCreamBricetAllGram + eggsAllGram;
        double kg1Gram = 1000.0;
        double sportBreakfastKg = sportBreakfastGram / kg1Gram;

        System.out.printf("Наш чемпионский спортзавтрак получился %d граммов, а если его перевести в килограммы, тогда будет %.2f кг.\n",sportBreakfastGram,sportBreakfastKg);
        System.out.println();
        // Задача 7
        int needMinusKg = 7;
        int kg1Gramm = 1000;
        int needMinusGram = needMinusKg * kg1Gramm;
        int workoutGramDayMinimum = 250;
        int workoutGramDayMax = 500;
        int loseWeightAllDay250 = needMinusGram / workoutGramDayMinimum;
        int loseWeightAllDay500 = needMinusGram / workoutGramDayMax;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то это займет " + loseWeightAllDay250 + " дней, а если каждый день будет худеть на 500 грамм, тогда уйдет " + loseWeightAllDay500 + " дней.");
        System.out.println();
        // Задача 8
        double monthSalaryMasha = 67760.;
        double monthSalaryDenis = 83690.;
        double monthSalaryKristina = 76230.;
        int monthOfYear = 12;
        double yearSalaryMashaNow = monthSalaryMasha * monthOfYear;
        double yearSalaryDenisNow = monthSalaryDenis * monthOfYear;
        double yearSalaryKristinaNow = monthSalaryKristina * monthOfYear;
        double monthSalaryMashaNew = monthSalaryMasha / 100 * 10;
        double monthSalaryDenisNew = monthSalaryDenis / 100 * 10;
        double monthSalaryKristinaNew = monthSalaryKristina / 100 * 10;
        monthSalaryMashaNew = monthSalaryMasha + monthSalaryMashaNew;
        monthSalaryDenisNew = monthSalaryDenis + monthSalaryDenisNew;
        monthSalaryKristinaNew = monthSalaryKristina + monthSalaryKristinaNew;
        double yearSalaryMashaNew = monthSalaryMashaNew * monthOfYear;
        double yearSalaryDenisNew = monthSalaryDenisNew * monthOfYear;
        double yearSalaryKristinaNew = monthSalaryKristinaNew * monthOfYear;
        double differenceBetweenSalaryYearMasha = yearSalaryMashaNew - yearSalaryMashaNow;
        double differenceBetweenSalaryYearDenis = yearSalaryDenisNew - yearSalaryDenisNow;
        double differenceBetweenSalaryYearKristina = yearSalaryKristinaNew - yearSalaryKristinaNow;

        System.out.println("Маша теперь получает " + monthSalaryMashaNew + " рублей в месяц. Годовой доход вырос на " + differenceBetweenSalaryYearMasha + " рублей");
        System.out.println("Денис теперь получает " + monthSalaryDenisNew + " рублей в месяц. Годовой доход вырос на " + differenceBetweenSalaryYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthSalaryKristinaNew + " рублей в месяц. Годовой доход вырос на " + differenceBetweenSalaryYearKristina + " рублей");













    }
}