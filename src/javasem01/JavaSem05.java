package javasem01;

public class JavaSem05 {

    static double[] coinFlip(int N){

        double []result = {0, 0, 0};
        for (int i = 0; i < N; i++){
            int x = (int) ((Math.random() * ((1 - 0) + 1)) + 0);
            if (x == 0){
                result[0]++;
            }
            else if (x == 1){
                result[1]++;
            }

            result[2] = result[0]+(result[1]/10);

        }
        return result;
    }

    public static void main(String[] arguments) {
        int N = 8;
        double [] result = coinFlip(N);
        System.out.println(" number of heads = "+ result[0] +"\n number of tails = "+ result[1] +"\n ratio: nheads/ntails = "+ result[2]);
    }
}
/*double[] coinFlip(int N)
The method returns an array of three elements where:
element at index 0 - number of heads
element at index 1 - number of tails
element at index 2 - ratio: nheads/ntails
*/