/*************************************************************************
	> File Name: src/test/java/base/StreamReduceTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sun 27 Nov 2016 09:02:19 PM CST
 ************************************************************************/

package java8.streambase.test;

import org.junit.Test;
import java8.streambase.StreamReduce;

public class StreamReduceTest {
    private StreamReduce reduce;

    @Test
    public void test() {
        reduce = new StreamReduce();

        String[] args = {"one, ", "two, ", "three, ", "four "};
        int[] datas = {1, 2, 3, 4, 0, -1, 2, 3};
        double[] values = {1.1, 1.2, 2.3, -2.3, 0.3, 1.9};
        
        System.out.println("Concat : " + reduce.concat(args));
        System.out.println("min : " + reduce.min(values));
        System.out.println("sum : " + reduce.sum(datas));
        System.out.println("sumWithNoBeginNumber : " + reduce.sumWithNoBeginNumber(datas));
        System.out.println("Filter Concat : " + reduce.filterConcat(args));
    }
}
