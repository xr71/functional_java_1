public class KMachine {
    
    static void chorus() {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
    }

    static void greetings(String name) {
        System.out.println("Hello " + name +"!");
    }

    static int randDice() {
        double randNumber = Math.random() * 6 + 1;

        return (int) randNumber;
    }

    public static void main(String[] args) {
        chorus();

        greetings("New York");

        System.out.println(randDice());
    }
}
