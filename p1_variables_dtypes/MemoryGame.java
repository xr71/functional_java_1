class MemoryGame {
    public static void main(String argv[]) {
        int passengers = 0;

        passengers += 5;
        passengers -= 3;
        passengers -= 1;
        passengers += 5;

        System.out.println(passengers);


        String driver;
        driver = "Hamish";

        System.out.println(driver);

        // driver is a String and String is an object in Java
        // we can operate methods on String types
        System.out.println(driver.length());
        System.out.println(driver.toUpperCase());


        // casting
        double a = 17;
        double b = 1.5;
        double f = a * b;

        System.out.println();
        System.out.println(f);
        System.out.println((int) f);
    }
}