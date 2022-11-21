public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль.");
        byte coreNumber = 3;
        short core = 2;
        int ddr = 8;
        long graphics = 1536;
        float ddrFrequency = 3733f;
        double date = 2020;
        char coreIndex = 'i';
        boolean color = true;

        System.out.println("Процессор Intel Core " + coreIndex
                + coreNumber + " " + core + "-ядерный процессор");
        System.out.println("Память " + ddr + "ГБ " + ddrFrequency + "MHz");
        System.out.println("Графика Intel Iris Plus Graphics " +
                graphics + " МБ");
        System.out.println("Цвет ноутбука - Розовый " + color + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой.");
        int pricePen = 100;
        int priceBook = 200;
        double sumDiscount  = (priceBook + pricePen) * 0.11;
        double discountPrice = priceBook + pricePen - sumDiscount;
        System.out.println("Сумма скидки " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой " + discountPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a     \n" + "   J   a a  v   v  a a     \n"
                + "J  J  aaaaa  V V  aaaaa     \n" + " JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных.");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println(maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte);

        System.out.println(maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort);

        System.out.println(maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt);

        System.out.println(maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong + "\n");

        System.out.println("5. Перестановка значений переменных.");
        int a1 = 2, a2 = 5, a3 = a1;
        System.out.println("Замена переменных, через 3ю переменную:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a1 = a2;
        a2 = a3;
        System.out.println("Новые значения: " + a1 + " " + a2);
        System.out.println("Замена переменных, через арифметические операции:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a1 -= a2;
        a2 += a1;
        a1 = a2 - a1;
        System.out.println("Новые значения: " + a1 + " " + a2);
        System.out.println("Замена переменных, через побитовую операцию:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a1 ^= a2;
        a2 ^= a1;
        a1 ^= a2;
        System.out.println("Новые значения: " + a1 + " " + a2 + "\n");

        System.out.println("6. Вывод символов и их кодов.");
        char c1 = '$', c2 = '&', c3 = '@', c4 = '^', c5 = '_';
        System.out.println((int) c1 + " " + c1);
        System.out.println((int) c2 + " " + c2);
        System.out.println((int) c3 + " " + c3);
        System.out.println((int) c4 + " " + c4);
        System.out.println((int) c5 + " " + c5 + "\n");

        System.out.println("7. Отображение количества сотен, десятков и единиц числа.");
        int srcNum = 123;
        int ones = srcNum % 10,
                tens = (srcNum / 10) % 10,
                hundreds = srcNum / 100;
        System.out.println("Число " + srcNum + " содержит: " + hundreds +
                " сотню, " + tens + " десятка, " + ones + " единицы.\n");
        System.out.println("8. Вывод на консоль ASCII-арт Дюка.");
        char slash = '/';
        char backSlash = '\\';
        char underLine = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underLine + openParenthesis + " " + openParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println(slash + "" + underLine + underLine + underLine +
                underLine + "" + slash + backSlash + underLine + underLine + backSlash + "\n");

        System.out.println("9. Произведение и сумма цифр числа.");
        int srcNum2 = 345,
                sumDigits,
                multDigits,
                hundreds9 = srcNum2 / 100,
                tens9 = (srcNum2 / 10) % 10,
                ones9 = srcNum2 % 10;
        sumDigits = hundreds9 + tens9 + ones9;
        multDigits = hundreds9 * tens9 * ones9;
        System.out.println("Сумма числа: " + sumDigits);
        System.out.println("Произведение числа: " + multDigits + "\n");

        System.out.println("10. Преобразование секунд.");
        int second = 86399,
                hh = second / 3600,
                mm = second % 3600 / 60,
                ss = second % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}