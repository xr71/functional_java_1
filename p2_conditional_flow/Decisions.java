class Decisions {

    public static void main(String argv[]) {
        Boolean isCold = true;

        if (isCold) {
            System.out.println("It's cold!");
        }

        float temp = 30;

        if (temp < 32) {
            System.out.println("It's cold");
        }

        // logical expressions
        // && || !

        // case and switch
        int monthNum = 1;

        String stringMonth = "";

        switch (monthNum) {
            case 1:
                stringMonth = "January";
                break;
        
            default:
                stringMonth = "Invalid Month Number";
                break;
        }

        System.out.println(stringMonth);
    }
}