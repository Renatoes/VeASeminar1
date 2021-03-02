package javasem01;

public class JavaSem08 {

    static double executeStringEquation(String inputEquation) {
        /*@brief this function uses string to char and char to int system, that takes every element of sring and translate it to
        char code, after char code, it translates it to int by using equation, after that, fucntion uses int positioning and
        arythmetic signs positioning, and by rules in mathematics, first times or division from left is going to process first,
        we are using loop that shows any bigger position of int than ari sign and takes it as 2nd integer, same as 1st bit
        we use smaller than. After that we doing same with others signs, if they exist and get the result.
         *
         * */

        char[] array = new char[inputEquation.length()];
        for (int i = 0; i < inputEquation.length(); ++i) {
            array[i] = inputEquation.charAt(i);

        }
        double[] arrayInt = new double[inputEquation.length()];
        int[] arrayCharToInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intPosition = new int[inputEquation.length()];
        int[] ariPosition = new int[inputEquation.length()];
        double result = 0;
        String[] signs = {"plus", "minus", "times", "division"};
        String[] signsTrue = new String[inputEquation.length()];
        int index = 0;
        int indexAri = 0;
        boolean timesPass = false;
        boolean divisionPass = false;
        boolean minusPass = false;

        for (int i = 0; i < inputEquation.length(); ++i) {
            if (array[i] >= 48 && array[i] <= 57) {
                arrayInt[i] = array[i];
                for (int j = 0; j <= 9; ++j) {
                    if (arrayInt[i] == 48 + j) {
                        arrayInt[i] = arrayCharToInt[j];

                        intPosition[index] = i;
                        index++;

                    }
                }

            }


            if (array[i] >= 42 && (array[i] != 44 && array[i] != 46) && array[i] <= 47) {
                if (array[i] == 42) {
                    ariPosition[indexAri] = i;
                    signsTrue[indexAri] = signs[2];
                    indexAri++;
                } else if (array[i] == 43) {
                    ariPosition[indexAri] = i;
                    signsTrue[indexAri] = signs[0];
                    indexAri++;
                } else if (array[i] == 45) {
                    ariPosition[indexAri] = i;
                    signsTrue[indexAri] = signs[1];
                    indexAri++;
                } else if (array[i] == 47) {
                    ariPosition[indexAri] = i;
                    signsTrue[indexAri] = signs[3];
                    indexAri++;
                } else {
                    continue;
                }
            }


        }


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

        for (int u = 0; u < indexAri; u++) {
            if (signsTrue[u].equals("times")) {
                double temp1 = 0;
                double temp2 = 0;
                int indexX1 = 0;
                int indexX2 = 0;
                for (int x = 0; x < index; x++) {

                    if (intPosition[x] < ariPosition[u]) {
                        indexX2 = intPosition[x + 1];
                        temp2 = arrayInt[intPosition[x + 1]];


                    } else if (intPosition[x] > ariPosition[u]) {
                        indexX1 = intPosition[x - 1];
                        temp1 = arrayInt[intPosition[x - 1]];
                        intPosition[x - 1] = intPosition[x];
                        for (int p = x - 1; p < index; p++) {
                            intPosition[p + 1] = intPosition[p + 2] - 1;
                        }

                        break;

                    }
                }
                arrayInt[indexX1] = 0;
                signsTrue[u] = "none";
                result = temp1 * temp2;
                arrayInt[indexX2] = result;
                timesPass = true;
            }
            else if (signsTrue[u].equals("division")) {
                double temp1 = 0;
                double temp2 = 0;
                int indexX1 = 0;
                int indexX2 = 0;
                for (int x = 0; x < index; x++) {

                    if (intPosition[x] < ariPosition[u]) {
                        indexX2 = intPosition[x + 1];
                        temp2 = arrayInt[intPosition[x + 1]];


                    } else if (intPosition[x] > ariPosition[u]) {
                        indexX1 = intPosition[x - 1];
                        temp1 = arrayInt[intPosition[x - 1]];
                        for (int p = x - 1; p < index; p++) {
                            intPosition[p] = intPosition[p + 1];
                        }

                        break;

                    }
                }

                arrayInt[indexX1] = 0;
                signsTrue[u] = "none";
                result = temp1 / temp2;
                arrayInt[indexX2] = result;
                divisionPass = true;
            }
            if (divisionPass && timesPass || (timesPass && !divisionPass && u == indexAri - 1) || (divisionPass && !timesPass && u == indexAri - 1) || (!divisionPass && !timesPass && u == indexAri - 1)) {
                int counter = 0;
                for (int b = 0; b < inputEquation.length(); b++) {
                    if (intPosition[b] > 0) {
                        counter++;
                    }
                }
                for (int r = 0; r < indexAri; r++) {
                    if (signsTrue[r].equals("minus")) {
                        double minusTemp1 = 0;
                        double minusTemp2 = 0;
                        int indexX1 = 0;
                        int indexX2 = 0;

                        for (int x = 0; x < counter; x++) {
                            if (intPosition[x] < ariPosition[u]) {
                                indexX2 = intPosition[x + 1];
                                minusTemp2 = arrayInt[intPosition[x + 1]];
                            } else if (intPosition[x] > ariPosition[u]) {
                                indexX1 = intPosition[x - 1];
                                minusTemp1 = arrayInt[intPosition[x - 1]];
                                for (int p = x - 1; p < index; p++) {
                                    intPosition[p] = intPosition[p + 1];
                                }

                                break;

                            }
                        }
                        arrayInt[indexX1] = 0;
                        signsTrue[r] = "none";
                        result = minusTemp1 - minusTemp2;
                        arrayInt[indexX2] = result;
                    }

                }
                counter = 0;
                for (int b = 0; b < inputEquation.length(); b++) {
                    if (intPosition[b] > 0) {
                        counter++;
                    }
                }
                for (int g = 0; g < indexAri; g++) {
                    if (signsTrue[g].equals("plus")) {

                        double plusTemp1 = 0;
                        double plusTemp2 = 0;
                        int indexX1 = 0;
                        int indexX2 = 0;

                        for (int x = 0; x < counter; x++) {

                            if (intPosition[x] < ariPosition[g]) {
                                indexX2 = intPosition[x];
                                plusTemp2 = arrayInt[intPosition[x]];


                            } else if (intPosition[x] > ariPosition[g]) {
                                indexX1 = intPosition[x];
                                plusTemp1 = arrayInt[intPosition[x]];
                                for (int p = x; p < index; p++) {
                                    intPosition[p] = intPosition[p + 1];
                                }

                                break;


                            }
                        }
                        arrayInt[indexX1] = 0;
                        signsTrue[u] = "none";
                        result = plusTemp1 + plusTemp2;
                        arrayInt[indexX2] = result;
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] arguments) {
        String inputEquation = "1 - 3 * 18 / 4 + 2";
        System.out.println(executeStringEquation(inputEquation));
    }
}

/*
Try to execute the expression written as a String:
String inputEquation = “1 - 3 * 18 / 4 + 2”;
Output: -10.5
Implementation
double executeStringEquation(String inputEquation)
*/






