import java.util.Scanner;

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

        task9();


    }

    private static void task8() {
        /*Мы решили написать астрономическое приложение, которое считает, когда
         над Землей пролетают кометы и их можно будет увидеть. Для начала нам
         нужно посчитать траекторию движения кометы, которая пролетает рядом
         с Землей каждый 79-й год, начиная с нулевого.
         Нам нужно узнать, в каких годах комета пролетала рядом с Землей за
         последние 200 лет и когда мы увидим ее в следующий раз.
         Условия задачи:
         В консоль нужно вывести все годы за последние 200 лет, когда появлялась
          комета, а также следующий год ее появления.Для вычисления периода
          можно создать две дополнительные переменные, которые содержат год
          за 200 лет до текущего (из созданной ранее переменной) в качестве
          старта и 100 лет после в качестве завершения периода расчета.*/
        System.out.println("Задание 3-1");
        int cycleComet = 79;
        int yearNow = 2022;
        int ferstYearBefore2022 = 0;
        while (ferstYearBefore2022 <yearNow - 200) {
            ferstYearBefore2022 = ferstYearBefore2022 + cycleComet ;
        }
        for (int i = 1; i<=3 ; i++ ) {
            System.out.println(ferstYearBefore2022);
            ferstYearBefore2022 =ferstYearBefore2022 + cycleComet;

        }

    }

    private static void task9() {
        /*Напишите программу, которая выводит в консоль таблицу умножения на 2: */
        System.out.println("Задание 3-2");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d" , i , 2*i);
            System.out.println();
        }
        System.out.println();
    }

    private static void task7() {
        /*В вашей компании пятница является днем отчетным. Нам нужно написать
        программу, которая считает дни месяца по датам, определяет, какой день
        пятница, и выводит сообщение с напоминанием, что нужно подготовить
        еженедельный отчет.
        Условия задачи: Создайте переменную типа int, которая хранит в себе
        номер первой пятницы месяца (число от 1 до 7). Выведите на каждую
        пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись
        от 4 до 5 сообщений с напоминаниями по разным датам.*/
        System.out.println("Задание 2-4");
        System.out.println("Введите какой по счету день недели первая пятница в этом месяце");
        Scanner day = new Scanner(System.in);
        int friday = day.nextInt() ; // определяем какой по счету день недели пятница
        System.out.println("Сколько дней в месяце");
        int daysInMonth = day.nextInt();
        if ( friday < 0 || friday > 7 || daysInMonth < 28 || daysInMonth >31) {
            System.out.println("Вы в школе учились? или в носу ковырялись?");
        } else {
            for (; friday <= daysInMonth; friday = friday + 7) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.", friday);
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void task6() {
        /*Василий решил, что год копить деньги ближайшие 9 лет. И он хочет
        знать, какой будет сумма его накоплений каждые полгода на протяжении
         этих 9 лет. Исходная сумма всё так же 15 тысяч рублей, проценты
         банка – 7% ежемесячно. Напишите программу, которая будет выводить
         Василию сумму его накоплений за следующие каждые полгода в течение
          9 лет.*/
        System.out.println("Задание 2-3");
        int ratePerMonthPercent = 7;
        int contributionVasilyPerMonth = 15_000;
        int contributionVasily = 0;
        int month = 0;
        int accumulationInterval = 9 * 12;
        while (month != accumulationInterval) {
            month++;
            contributionVasily = contributionVasily + contributionVasilyPerMonth + contributionVasily*ratePerMonthPercent/100;
            if (month% 6 == 0 ) {
                System.out.printf("%d месяц, сумма накоплений %d", month, contributionVasily);
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void task5() {
        /*Видоизмените программу таким образом, чтобы в консоль выводились
        не все месяцы подряд, а только каждый шестой. Должны быть видны
        накопления за 6, 12, 18, 24 и далее месяцы. */
        System.out.println("Задание 2-2");
        int ratePerMonthPercent = 7;
        int contributionVasilyPerMonth = 15_000;
        int contributionVasily = 0;
        int purposeOfTheContribution = 12_000_000;
        int month = 0;
        while (contributionVasily<=purposeOfTheContribution) {
            month++;
            contributionVasily = contributionVasily + contributionVasilyPerMonth + contributionVasily*ratePerMonthPercent/100;
            if (month% 6 == 0 ) {
                System.out.printf("%d месяц, сумма накоплений %d", month, contributionVasily);
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void task4() {
        /*Напишите программу, которая выводит в консоль сумму накоплений.
        Василий решил положить деньги на накопительный счет, где каждый
        месяц к сумме его вклада добавляется ещё 7%. Первоначальная сумма
        вклада Василия составляет 15 тысяч рублей.
        ### Задание 1
        Вычислите и выведите в консоль, сколько месяцев Василию нужно
        будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений
        по каждому месяцу.*/
        System.out.println("Задание 2-1");
        int ratePerMonthPercent = 7;
        int contributionVasilyPerMonth = 15_000;
        int contributionVasily = 0;
        int purposeOfTheContribution = 12_000_000;
        int month = 0;
        while (contributionVasily<=purposeOfTheContribution) {
            month++;
            contributionVasily = contributionVasily + contributionVasilyPerMonth + contributionVasily*ratePerMonthPercent/100;
            System.out.printf("%d месяц, сумма накоплений %d", month, contributionVasily);
            System.out.println();
        }
        System.out.println();
    }

    private static void task3() {
        /*В стране Y население равно 12 миллионам человек. Рождаемость составляет
         17 человек на 1000 человек, смертность - 8 человек. Рассчитайте,
         какая численность населения будет через 10 лет, принимая во внимание,
         что показатели рождаемости и смертности постоянны. В консоль выведите
         результат операции на каждый год в формате “Год …, численность
         населения составляет … ”*/
        System.out.println("Задание 1-3");
        int populetion = 12_000_000;
        int yearNow = 2020;
        int yearGo = 10;
        int birthPer1000 = 17;
        int deadPer1000 = 8;
        for ( ; yearGo >= 1 ; yearGo--) {
            populetion = populetion + populetion/1000*(birthPer1000-deadPer1000);
            yearNow++;
            System.out.printf("Год %d, численность населения составляет %d " , yearNow , populetion);
            System.out.println();
        }
        System.out.println();
    }

    private static void task2() {
        /*Выведите в одну строку через пробел числа от 1 до 10, используя цикл
         while. На следующей строке выведите числа в обратном порядке от 10 до 1,
          используя оператор for. Для обоих циклов можно использовать
          как одну общую переменную, так и в каждом цикле свою.*/
        System.out.println("Задание 1-2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task1() {
        /*С помощью цикла while посчитайте, сколько месяцев потребуется,
        чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем
         0 рублей и готовы откладывать по 15 тысяч рублей. Результат программы
          должен быть выведен в консоль в формате "Месяц … , сумма накоплений
          равна … рублей" с тем количеством месяцев, необходимым для
          накопления данной суммы.*/
        System.out.println("Задание 1-1");
        int bank = 0;
        int month = 0;
        while (bank<2_459_000) {
            bank = bank + 15_000;
            month = month + 1;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей с тем количеством месяцев, необходимым для накопления данной суммы \n" , month , bank);
        }
        System.out.println("Проверка month*15_000 = " + month*15_000);
    }
}