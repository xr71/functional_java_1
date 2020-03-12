public class MultiSidedDice {

    static int rollDice(int sides) {
        /**
         * This dice function       
         * 
         *@param sides an integer that dictates the number of sided dice
         *@return an integer that shows the side up number of the dice
         */
        double randomNumber = Math.random() * sides + 1;
        return (int) randomNumber;
    }

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(rollDice(6));
        }
    }
}
