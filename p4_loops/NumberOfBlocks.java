public class NumberOfBlocks {
    static int countBlocks(int levels) {

        int totalBlocks = 0;

        for (int i=1; i<=levels; i++) {
            totalBlocks += i*i;    
        }

        return totalBlocks;

    }

    public static void main(String[] args) {

        System.out.println(countBlocks(1));
        System.out.println(countBlocks(3));
        System.out.println(countBlocks(2));
        System.out.println(countBlocks(5));

    }
}
