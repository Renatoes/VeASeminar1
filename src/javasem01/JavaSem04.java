package javasem01;

public class JavaSem04 {
    static double[][] generateMatrix(int N){
        double [][] arr = new double[N][N];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                arr[j][i] = (Math.random() * ((0.1 - 100) + 1)) + 100;
            }
        }
        return arr;
    }

    static double getProduct(double[][] matrix, int i, int j){
        return matrix[i][j];
    }

    public static void main(String[] arguments) {
        int N = 8;
        double[][] arr  = generateMatrix(N);
        System.out.println(getProduct(arr, 0,2));

    }
//double[][] generateMatrix(int N)
//double getProduct(double[][] matrix, int i, int j)
}
