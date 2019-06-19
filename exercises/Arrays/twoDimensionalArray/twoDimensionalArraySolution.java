package twoDimensionalArray;

// https://www.hackerrank.com/challenges/2d-array/problem
class twoDimensionalArraySolution {
    public static void main(String[] args) {}

    static int hourglassSum(int[][] arr) {
        int maxSum = 0;
        int tempSum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tempSum = 0;

                // ensure we do not go out of bounds of 6x6 2D array
                if (i < 4 && j < 4) {
                    // assign current i/j values to temp values
                    int tempI = i;
                    int tempJ = j;

                    // add first row
                    tempSum += arr[tempI][tempJ];
                    tempJ++;
                    tempSum += arr[tempI][tempJ];
                    tempJ++;
                    tempSum += arr[tempI][tempJ];

                    // increment I index to next row
                    tempI++;

                    // go to middle column and add center value for second row
                    tempJ--;
                    tempSum += arr[tempI][tempJ];

                    // reset J index and increment I index
                    tempI++; tempJ--;

                    // add third row
                    tempSum += arr[tempI][tempJ];
                    tempJ++;
                    tempSum += arr[tempI][tempJ];
                    tempJ++;
                    tempSum += arr[tempI][tempJ];

                    // default first hourglass as maxSum
                    if (i == 0 && j == 0) {
                        maxSum = tempSum;
                        // else check if new hourglass is larger sum
                    } else if (tempSum > maxSum) {
                        maxSum = tempSum;
                    }
                }
            }
        }
        return maxSum;
    }
}