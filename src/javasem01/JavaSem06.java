package javasem01;

public class JavaSem06 {



    static String getTextFromBytes(byte[] array){
        String result = "";
        for (int i = 0; i < array.length; i++){
            result += (char) array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        byte[] array = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
                32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
        System.out.println(getTextFromBytes(array));
    }
}
