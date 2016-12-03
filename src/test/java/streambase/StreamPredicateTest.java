/*************************************************************************
	> File Name: src/test/java/base/StreamPredicateTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sat 03 Dec 2016 07:21:22 PM CST
 ************************************************************************/

package java8.streambase.test;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import java8.streambase.StreamPredicate;

public class StreamPredicateTest {
    @Test
    public void test() {
        StreamPredicate predicate = new StreamPredicate();
        List<String> names = Arrays.asList("Jack", "Tom", "Jeff", "Jeffs", "Shall", "Someone");
        predicate.test(names);
    }

}
