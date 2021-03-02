package javasem01;

public class JavaSem07 {

    static int[] pascalsTriangle(int level){
        int [] array = new int [level+1];
        int row = 1;
        int indx = 1;
        int indxTrue = 0;
        int indxResult = 1;
        int tempo2 = 1;
        array[0] = 1;
        array[level] = 1;
        for (int i = 1; i < level+1; ++i) {
            row *= i;
        }
        for (int h = 1; h < level; ++h) {
            indx = h;
            indxTrue = h;
            for (int j = 1; j < h; j++) {

                indx *= j;

            }
            indxResult = indx;
            int temp = level - indxTrue;
            tempo2 = 1;
            for (int k = 1; k < temp+1; k++){
                tempo2 *= k;
            }
            tempo2 *= indxResult;
//            System.out.println("row = " + row);
//            System.out.println("tempo2 = " + tempo2);
//            System.out.println("indxTrue = " + indxTrue);
//            System.out.println("indxResult = " + indxResult);


            array[indxTrue] =row / tempo2;
//            System.out.println("array[indxTrue = " + array[indxTrue]);
        }



        return array;
        }




    public static void main(String[] arguments) {
        int level = 9;
        int [] array = pascalsTriangle(level);
        for (int i = 0; i < level+1; ++i) {
            System.out.print(" " + array[i]);
        }
    }
}
/*int level = 6;
String pascalsTriangle(int level);*/