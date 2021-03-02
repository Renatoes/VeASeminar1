package javasem01;

public class JavaSem03 {
    static double[] generateArray(int N, double lower, double upper){
        double [] arr = new double[N];
        for (int i = 0; i < N; i++){
            arr[i] = (Math.random() * ((upper - lower) + 1)) + lower;
        }
        return arr;
    }
    static double getMax(double[] array){
        double temp = array[0];
        for (double tempFor : array){
            if (tempFor > temp){
                temp = tempFor;
            }
        }
        return temp;
    }
    static double getMin(double[] array){
        double temp = array[0];
        for (double tempFor : array){
            if (tempFor < temp){
                temp = tempFor;
            }
        }
        return temp;
    }
    public static void main(String[] arguments) {
        int N = 8;
        double[] array = generateArray(N,1.25, 25.3);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Min = " + getMin(array));
        System.out.println("Max = " +getMax(array));

    }
}
/*double[] generateArray(int N, double lower, double upper)
double getMean(double[] array)
double getMin(double[] array)
double getMax(double[] array)
double[] arraySort(double[] array)
*/
