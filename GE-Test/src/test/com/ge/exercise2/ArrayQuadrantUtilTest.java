package test.com.ge.exercise2;

import main.com.ge.exercise2.ArrayQuadrantUtil;

import org.junit.Assume;
import org.junit.Test;



import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

    @Test
    public void getQuadrantValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));

        char[] expectedResult = {'a', 'b', 'e', 'f'};
        assertArrayEquals(expectedResult, util.getQuadrantValues(0, 1));
    }
    
    @Test
    public void getRowTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        

        char[] expectedResult = {'a', 'b', 'c', 'd'};
        assertArrayEquals(expectedResult, util.getPartRow(0));
    }
    
    @Test
    public void getColumnTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);

        char[] expectedResult = {'a', 'e', 'i', 'm'};
        assertArrayEquals(expectedResult, util.getPartColmn(0));
    }
}