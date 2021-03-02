package javasem01;


public class JavaSem02 {


    static int factorialForLoop(int N){
        int f = 1;
        if (N > 0) {
            for (int i = 2; i <= N; i++) {
                f = f * i;
                if (i == N) {
                    return f;
                }
            }
        }
        else {
            return 0;
        }
        return N;
    }
    static int factorialRecursive(int N){
        if (N>0) {
            N = N -1;
            return (N+1) * factorialRecursive(N);

        }
        else{
            return 0;
        }

    }
    public static void main(String[] arguments) {
    int N = 8;
        System.out.println(factorialForLoop(N));
        System.out.println(factorialRecursive(N));
    }
}