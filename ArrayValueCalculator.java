public class ArrayValueCalculator {
    public static void main (String args[]) throws ArrayDataException, ArraySizeException {
        String[][] matrix = { { "3", "2", "1", "7" },
                { "9", "11", "5", "4" },
                { "6", "0", "13", "17" },
                { "5", "21", "14", "15" } };
        System.out.println (doCalc(matrix));
    }

    static int doCalc (String [][] myArray) throws ArrayDataException, ArraySizeException {
        // returns the length of the rows in the array
        int lengthRows = myArray.length;
        // returns the length of the columns in the array
        int lengthColumns = myArray[0].length;
        if (lengthRows != 4 || lengthColumns != 4)
            throw new ArraySizeException("Incorrect size of the matrix. The size should be 4x4");
        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(myArray[j][i]);
                }
                catch (Exception e) {
                    throw new ArrayDataException("Can not parse array element: " + j +"," + i);
                }
            }
        }
        return sum;
    }
}