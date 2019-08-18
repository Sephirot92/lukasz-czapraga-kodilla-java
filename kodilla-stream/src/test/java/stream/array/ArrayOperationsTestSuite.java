package stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testArrayOperations() {
        //Given
        int[] simpleArray = {1,8,5,6,4,1,3,2,6,4,8,2};

        //when

        double testThisArray =ArrayOperations.getAverage(simpleArray);
        System.out.println(testThisArray);
        System.out.println();
        //Then
        Assert.assertEquals(4.166666666666667, testThisArray, 0);
    }

}
