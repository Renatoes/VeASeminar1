package javasem01;

public class JavaSem05_PART3 {
    static int roll2Dices(){

        int result = 0;
        boolean twoSixes = false;
        while (!twoSixes){
            int x = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
            int y = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
            if (x == 6 && y == 6){
                twoSixes = true;
            }
            result++;

        }
        return result;
    }

    public static void main(String[] arguments) {
        System.out.println("number of tries to get 6 on both dices = " + roll2Dices());
    }
}
