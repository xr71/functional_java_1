public class Yahtzee {

    static int rollDice() {
        double randNum = Math.random() * 6 + 1;

        return (int) randNum;
    }

    static int keepRolling() {
        int count = 1;

        int Dice1 = rollDice();
        int Dice2 = rollDice();

        while (Dice1 != Dice2) {
            Dice1 = rollDice();
            Dice2 = rollDice();

            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int counts = keepRolling();

        System.out.println(counts);

    }
}
