/*************************************************************************
	> File Name: src/main/java/streamexample/IntCount.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sat 03 Dec 2016 07:37:50 PM CST
 ************************************************************************/

package java8.streamexample;

import java.util.List;
import java.util.Arrays;

import java.util.IntSummaryStatistics;

public class IntCount {
    public IntSummaryStatistics getStatistics(List<Integer> primes) {
        return primes.stream().mapToInt(x -> x).
            summaryStatistics();
    }

}
