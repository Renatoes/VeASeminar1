package javasem01;

public class JavaSem05_PART2 {

    static int[] rollDice(int N){

        int []result = new int[N];
        for (int i = 0; i < N; i++){
            result[i] =  (int) ((Math.random() * ((6 - 1) + 1)) + 1);


        }
        return result;
    }

    public static void main(String[] arguments) {
        int N = 8;
        int [] result = rollDice(N);
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
