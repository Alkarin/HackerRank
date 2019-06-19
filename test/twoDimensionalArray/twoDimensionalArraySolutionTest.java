package twoDimensionalArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class twoDimensionalArraySolutionTest {
    @Test
    public void testOne() {
        int[][] testArray = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        twoDimensionalArraySolution tester = new twoDimensionalArraySolution();
        assertEquals(tester.hourglassSum(testArray),19);
    }

    @Test
    public void testTwo() {
        int[][] testArray = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,9,2,-4,-4,0},
                {0,0,0,-2,0,0},
                {0,0,-1,-2,-4,0}
        };
        twoDimensionalArraySolution tester = new twoDimensionalArraySolution();
        assertEquals(tester.hourglassSum(testArray),13);
    }

    @Test
    public void testEight(){
        int[][] testArray = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };
        twoDimensionalArraySolution tester = new twoDimensionalArraySolution();
        assertEquals(tester.hourglassSum(testArray),28);
    }
}