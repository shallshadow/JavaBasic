/*************************************************************************
	> File Name: src/test/java/base/StreamOperateTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 07:22:25 PM CST
 ************************************************************************/

package java8.base.test;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;

import java8.base.StreamOperate;
import java8.base.StreamTrans;

public class StreamOperateTest {
    private static StreamOperate operate;
    private static StreamTrans trans;
    private Stream stream;

    @BeforeClass
    public static void init() {
        operate = new StreamOperate();
        trans = new StreamTrans();
    }

    @Before
    public void initStream() {
        stream = Stream.of("a", "b", "c", "d");
    }

    @Test
    public void testToUpper() {
        List<String> list = operate.toUpper(trans.toList(stream));
        list.stream().forEach(System.out::println);
    }

    @Test
    public void testSequare() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = operate.sequare(nums);
        result.stream().forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2),
                Arrays.asList(5)
                );
        Stream<Integer> outputStream = operate.flatMap(inputStream);
        outputStream.forEach(num -> System.out.println("The num is " + num));
    }

    @Test
    public void testFilter() {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 6, 7};
        Integer[] odds = operate.filterOdd(nums);
        Stream.of(odds).forEach(num -> System.out.println("The odd num is " + num));
        
    }

    @Test
    public void testPeek() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        operate.peek(list);
    }

    @Test
    public void testFindFirst() {
        String strA = "abc";
        String strB = null;
        operate.printWithNoNull(strA);
        operate.printWithNoNull(strB);
    }
}
