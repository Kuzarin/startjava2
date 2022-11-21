public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Первая задача.");
        int age = 17;
        double height = 1.76;
        boolean sex = true;
        char firstName;
        if (age > 20) {
            System.out.print("Взрослый человек ");
        } else {
            System.out.print("Ребенок");
        }
        if (sex = true) {
            System.out.print(", кажется мужского пола и ");
        } else {
            System.out.print(", кажется этот человек был женского пола и ");
        }
        if (height < 1.80) {
            System.out.print("высокого роста");
        } else {
            System.out.print("низкого роста");
        }
        firstName = ("Сергей").charAt(0);
        if (firstName == 'М') {
            System.out.println(" возможно еще зовут Миша!\n");
        } else if (firstName == 'I') {
            System.out.println(" возможно его завут Иван!\n");
        } else {
            System.out.println(" это был Сергей из соседнего двора!\n");
        }

        System.out.println("2. Поиск max и min числа.");
        int a = 250, b = 250;
        if (a > b) {
            System.out.println("Максимальное число: " + a + " , а минимальное число: " + b + "\n");
        } else if (a < b) {
            System.out.println("Максимальное число: " + b + " , а минимальное число: " + a + "\n");
        } else {
            System.out.println("Числа равны = " + a + "\n");
        }

        System.out.println("3. Работа с числом.");
        int x = -33;
        if (x == 0) {
            System.out.println("Число это 0.");
        } else if ((x % 2) == 0) {
            System.out.println("Число четное.");
        } else if ((x % 2) != 0) {
            System.out.println("Число нечетное.");
        }
        if (x > 0) {
            System.out.println("Число положительное.");
        } else if (x < 0) {
            System.out.println("Число отрицательное.");
        }
        System.out.println("Это число: " + x + "\n");

        System.out.println("4. Поиск одинаковых цифр в числах.");
        int number1 = 376, number2 = 176, hundred1 = number1 / 100, hundred2 = number2 / 100,
                tens1 = (number1 - hundred1 * 100) / 10, tens2 = (number2 - hundred2 * 100) / 10,
                ones1 = number1 % 10, ones2 = number2 % 10;
        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2);
        if (hundred1 == hundred2) {
            System.out.println("Первый разряд: " + hundred1 + " совпадает у наших чисел.");
        }
        if (tens1 == tens2) {
            System.out.println("Второй разряд: " + tens1 + " совпадает у наших чисел.");
        }
        if (ones1 == ones2) {
            System.out.println("Третий разряд: " + ones1 + " совпадает у наших чисел.");
        } else {
            System.out.println("Одинаковых разрядов чисел нет.");
        }
        System.out.println("Первое число состоит из: " + "первого разряда " + hundred1 + ", второго разряда "
                + tens1 + ", третьего разряда " + ones1);
        System.out.println("Второе число состоит из: " + "первого разряда " + hundred2 + ", второго разряда "
                + tens2 + ", третьего разряда " + ones2);

        /*маленькая буква
        большая буква
        число
        не буква и не число*/

        System.out.println("5. Определение буквы, числа или символа по их коду.");
        char simbol = '\u0057';
        System.out.println(simbol);
        if (simbol >= 'a' && simbol <= 'z') {
            System.out.println("Это маленькая буква.");
        } else if (simbol >= 'A' && simbol <= 'Z') {
            System.out.println("Это большая буква.");
        } else if (simbol >= 0 && simbol <= 9) {
            System.out.println("Это цифра.");
        } else {
            System.out.println("Это не буква и не число!");
        }

        System.out.println("6. Определение суммы вклада и начисленных банком %.");
        int deposit = 300_000;
        System.out.println("Сумма вклада: " + deposit);
        if (deposit < 100_000) {
            System.out.println("Ваш вклад с учетом % составит: " + deposit * 1.05);
        } else if (deposit > 100) {
            System.out.println("Ваш вклад с учетом % составит: " + deposit * 1.07);
        } else if (deposit > 300_000) {
            System.out.println("Ваш вклад с учетом % составит: " + deposit * 1.1);
        }

        System.out.println("7. Определение оценки по предметам.");
        int history = 59, program = 91;
        if (history > 91) {
            System.out.println("Вы получили: " + (history = 5) + " по истории.");
        } else if (history > 73) {
            System.out.println("Вы получили: " + (history = 4) + " по истории.");
        } else if (history > 60) {
            System.out.println("Вы получили: " + (history = 3) + " по истории.");
        } else {
            System.out.println("Вы получили: " + (history = 2) + " по истории.");
        }
        if (program > 91) {
            System.out.println("Вы получили: " + (program = 5) + " по программированию.");
        } else if (program > 73) {
            System.out.println("Вы получили: " + (program = 4) + " по программированию.");
        } else if (program > 60) {
            System.out.println("Вы получили: " + (program = 3) + " по программированию.");
        } else {
            System.out.println("Вы получили: " + (program = 2) + " по программированию.");
        }

        System.out.println("8. Расчет прибыли.");
        int rent = 5000, sumSale = 13000, priceSale = 9000,
                profit = sumSale - priceSale - rent;
        if (profit < 0) {
            System.out.println("прибыль за год: " + (profit * 12) + " руб.");
        } else {
            System.out.println("прибыль за год: +" + (profit * 12) + " руб.");
        }

        System.out.println("9. Подсчет количества банкнот.");
        int getUSD = 567, hundred = getUSD / 100, tens = (getUSD - hundred * 100) / 10,
                ones = (getUSD - hundred * 100) % 10, hundredBank = 5, tensBank = 5, onesBank = 50, sumBank;
        if (hundredBank < hundred) {
            hundred2 = hundredBank;
            tens1 = tens + hundred1 * 10;
        } else {
            hundred2 = hundred;
        }
        if (tensBank < tens1) {
            tens2 = tensBank;
            ones2 = ones + (tens - tens2) * 10;
        } else {
            hundred1 = hundred;
        }
        System.out.println("Вы получили:" + hundred2 + " сотен, " + tens2 + " десяток и " + ones2 +
                " однодолларовых купюр.");
        sumBank = hundred2 * 100 + tens2 *10 + ones2;
        System.out.println("Итого: " + hundred + " " + tens + " " + ones);
        System.out.println(sumBank);
    }
}
