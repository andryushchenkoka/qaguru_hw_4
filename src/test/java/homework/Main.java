package homework;

public class Main {

    public static void main(String[] args) {

        // Примитивные типы данных в Java
        byte    bMin = -128,
                b    = 8,
                bMax = 127;

        short   sMin = -32768,
                s    = 16800,
                sMax = 32767;

        int     iMin = -2_147_483_648,
                i    = 1234,
                iMax = 2_147_83_647;

        long    lMin = -9_223_372_036_854_775_808L,
                l    = 1_123_123_234_234_456_456L,
                lMax = 9_223_372_036_854_775_807L;

        float   fMin = 0.000000000000000000000000000000000000000000001f,
                f    = 123.456f,
                fMax = 340282346638528860000000000000000000009f;

        double  dMin = Double.MIN_VALUE,
                d    = 123.456,
                dMax = Double.MAX_VALUE;

        boolean bt   = true,
                bf   = false;

        char    c1   = 'a',
                c2   = '1',
                c3   = '\u0061';

        // Переполнение типа
        byte bOver = bMax + b;
        bOver = bMin + i;
        short sOver = sMax + s;
        sOver = sMin + i;

        // Вычисления
        System.out.println(s + f); // short и float
        System.out.println(i - d); // int и double
        System.out.println('a' * b); // char и byte. Умножается значение символа в десятичной системе (символ 'а' в ASCII это 97)
        System.out.println(l / s); // long и short
        System.out.println(s % i); // double и byte

        // Логические операторы
        System.out.println(isGreatThan(68, 7));
        System.out.println(isGreatThan(37, 12));
        System.out.println(isGreatThan(55, 5));
        System.out.println(isGreatThan(30, 10));
        System.out.println(isGreatThan(41, 6));
    }

    public static boolean isGreatThan(int target, int iterations){
        int sum = 0;

        for(int j = 0; j < iterations; j++){
            sum += (int)(Math.random()*10);
        }
        System.out.println("Сумма получилась: " + sum + ". Ожидалось: " + target);

        if(sum > target && sum != 0) return true;
        else return false;

        // return бы написал без конструкций:   return sum > target;
    }
}
