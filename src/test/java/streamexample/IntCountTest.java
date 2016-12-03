/*************************************************************************
	> File Name: src/test/java/streamexample/IntCountTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sat 03 Dec 2016 07:43:19 PM CST
 ************************************************************************/

package java8.streamexample.test;

import java8.streamexample.IntCount;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class IntCountTest {

    @Test
    public void test() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = new IntCount().getStatistics(primes);

        System.out.println("Highest prime number in list : " + stats.getMax());
        System.out.println("Lowest prime number in list : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }
}
