public class Main {
    public static void main(String[] args) {
        int intVar = 1550;
        byte byteVar = 123;
        short shortVar = 340;
        long longVar = 3673;
        double doubleVar = 23.5;
        float floatVar = 13.5f;

        //Расширение:

        intVar = byteVar;
        System.out.println(intVar);

        longVar = shortVar;
        System.out.println(longVar);

        doubleVar = floatVar;
        System.out.println(doubleVar);

        System.out.println("...........................");


        //Сужение:

        int intVar1 = 1550;
        byte byteVar1 = 123;
        short shortVar1 = 3450;
        long longVar1 = 3656483;
        double doubleVar1 = 10.6;
        float floatVar1 = 13.5f;

        byteVar1 = (byte)intVar1;
        System.out.println(byteVar1);

        shortVar1 = (short)longVar1;
        System.out.println(shortVar1);

        floatVar1 = (float)doubleVar1;
        System.out.println(floatVar1);

    }
}
