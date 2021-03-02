package javasem01;

public class JavaSem09 {


    static String setOperations(String input) {
        char[] array = new char[input.length()];
        Integer myInf = Integer.MAX_VALUE;
        int sign = 0;
        for (int i = 0; i < input.length(); ++i) {
            array[i] = input.charAt(i);
            if (array[i] >= 42 && (array[i] != 44 && array[i] != 46) && array[i] <= 47) {
                sign = i;
            }
        }
        int[] arrayInt1 = new int[input.length()];
        int[] arrayInt2 = new int[input.length()];
        String result = "";
        int[] arrayCharToInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intPosition = new int[input.length()];
        int[] intPosition2 = new int[input.length()];
        int posIndex = 0;
        int posIndex2 = 0;
        int index2 = 0;
        int index = 0;


        if (array[sign] == 43) {
            result = "[ ";
            for (int i = 0; i < sign; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    arrayInt1[i] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt1[i] == 48 + j) {
                            arrayInt1[i] = arrayCharToInt[j];
                            result += arrayInt1[i] + ", ";
                            index = i;
                        }
                    }

                }
            }
            for (int i = sign; i < array.length; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    index2 = i - sign;
                    arrayInt2[i - sign] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt2[i - sign] == 48 + j) {
                            arrayInt2[i - sign] = arrayCharToInt[j];
                            if (arrayInt1[index] == arrayInt2[index2]) {
                                break;
                            }
                            result += arrayInt2[i - sign] + ", ";
                        }
                    }
                }
            }
            return result+="]";
        }



        else if (array[sign] == 42){
            result = "[ ";
            for (int i = 0; i < sign; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    arrayInt1[i] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt1[i] == 48 + j) {
                            arrayInt1[i] = arrayCharToInt[j];
                            index = i;
                            intPosition[posIndex] = index;
                            posIndex++;

                        }
                    }

                }
            }


            for (int i = 0; i < posIndex; ++i) {
                if (i > 0 && intPosition[i - 1] == (intPosition[i] - 1)) {

                    arrayInt1[intPosition[i - 1]] = arrayInt1[intPosition[i - 1]] * 10 + arrayInt1[intPosition[i]];
                    arrayInt1[intPosition[i]] = arrayInt1[intPosition[i + 1]];
                    for (int r = i+1; r < intPosition.length - 1; r++) {
                        arrayInt1[intPosition[r]] = arrayInt1[intPosition[r + 1]];

                    }

                    arrayInt1[intPosition[posIndex - 1]] = myInf;
                    intPosition[posIndex - 1] = myInf;
                }

            }


            for (int i = sign; i < array.length; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    index2 = i - sign;
                    arrayInt2[i - sign] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt2[i - sign] == 48 + j) {
                            arrayInt2[i - sign] = arrayCharToInt[j];
                            intPosition2[posIndex2] = index2;
                            posIndex2++;
                        }
                    }
                }
            }
            for (int i = 0; i < posIndex - 1; i++){
                for (int j = 0; j < posIndex2; j++){
                    if (arrayInt1[intPosition[i]] == arrayInt2[intPosition2[j]]){
                        result+= arrayInt1[intPosition[i]];
                    }
                }
            }
            return result+=" ]";
        }



        else if (array[sign] == 45){
            result = "[ ";
            for (int i = 0; i < sign; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    arrayInt1[i] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt1[i] == 48 + j) {
                            arrayInt1[i] = arrayCharToInt[j];
                            index = i;
                            intPosition[posIndex] = index;
                            posIndex++;

                        }
                    }

                }
            }


            for (int i = 1; i < posIndex; ++i) {
                if (intPosition[i - 1] == (intPosition[i] - 1)) {
                    arrayInt1[intPosition[i - 1]] = arrayInt1[intPosition[i - 1]] * 10 + arrayInt1[intPosition[i]];
                    arrayInt1[intPosition[i]] = myInf;

                    intPosition[i - 1] = intPosition[i] - 1;

                }



            }

/*
[ 5, 10, 15, 20 ] - [ 10, 20, 80 ] [5, 15, 80]
0123456789112345678921234567893123
        for (int i = 0; i < index; ++i) {
            if (i > 0 && intPosition[i - 1] == (intPosition[i] - 1)) {

                arrayInt[intPosition[i - 1]] = arrayInt[intPosition[i - 1]] * 10 + arrayInt[intPosition[i]];

                for (int r = intPosition[i]; r < arrayInt.length - 1; r++) {
                    arrayInt[r] = arrayInt[r + 1];
                }
                arrayInt[arrayInt.length - 1] = 0;
                intPosition[i] = intPosition[i + 1];
                for (int r = i; r < index - 1; r++) {
                    intPosition[r] = intPosition[r + 1];
                }
                intPosition[index - 1] = -1;

            }

        }
 */

            for (int i = sign; i < array.length; ++i) {
                if (array[i] >= 48 && array[i] <= 57) {
                    index2 = i - sign;
                    arrayInt2[i - sign] = array[i];
                    for (int j = 0; j <= 9; ++j) {
                        if (arrayInt2[i - sign] == 48 + j) {
                            arrayInt2[i - sign] = arrayCharToInt[j];
                            intPosition2[posIndex2] = index2;
                            posIndex2++;
                        }
                    }
                }

            }
            for (int i = 1; i < posIndex2; ++i) {
                if (intPosition2[i - 1] == (intPosition2[i] - 1)) {
                    arrayInt2[intPosition2[i - 1]] = arrayInt2[intPosition2[i - 1]] * 10 + arrayInt2[intPosition2[i]];
                    arrayInt2[intPosition2[i]] = myInf;
                    intPosition2[i-1] = intPosition2[i]-1;
                }

            }
            boolean alert = false;
            for (int i = 0; i < posIndex; i++){
                for (int j = 0; j < posIndex2; j++){


                    if (arrayInt1[intPosition[i]] == arrayInt2[intPosition2[j]]){
                         break;

                    }
                    else if (j == posIndex2 -1){
                        result+= arrayInt1[intPosition[i]] + ", ";
                        break;
                    }



                }




            }
            for (int i = 0; i < posIndex2; i++) {
                for (int j = 0; j < posIndex; j++) {

                    if (arrayInt2[intPosition2[i]] == arrayInt1[intPosition[j]]) {
                        break;

                    } else if (j == posIndex2 - 1) {
                        result += arrayInt2[intPosition2[i]] + ", ";
                        break;
                    }
                }
            }
            return result+=" ]";
        }
        return result;
    }


    public static void main(String[] arguments) {
        String input1 = "[1, 2, 3] + [3, 5, 7]"; ///[ 1, 2, 3, 5, 7, ]
        String input2 = "[10, 9, 8, 7] * [2, 4, 6, 8]"; ///[ 8 ]
        String input3 = "[ 5, 10, 15, 20 ] - [ 10, 20, 80 ]"; ///[ 5, 15, 80,  ]
        //              0123456789112345678921234567893123
        System.out.println(setOperations(input1));
        System.out.println(setOperations(input2));
        System.out.println(setOperations(input3));
    }
}
/*
[1, 2, 3] + [3, 5, 7] [1, 2, 3, 5, 7]
[10, 9, 8, 7] * [2, 4, 6, 8] [8]
[ 5, 10, 15, 20 ] - [ 10, 20, 80 ] [5, 15, 80]
 */