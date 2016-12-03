/*************************************************************************
	> File Name: src/main/java/base/StreamContruct.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 03:22:22 PM CST
 ************************************************************************/

package java8.streambase;

import java.util.stream.*;
import java.util.List;
import java.util.Arrays;

public class StreamConstruct {

    public void testCommon() {
        //1. Individual values
        Stream stream = Stream.of("a", "b", "c", "d");
        stream.forEach(System.out::print);

        //2. Arrays
        String[] strArray = new String[] {"a", "b", "c"};
        stream = Stream.of(strArray);
        stream.forEach(System.out::print);

        stream = Arrays.stream(strArray);
        stream.forEach(System.out::print);

        //3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();
        stream.forEach(System.out::print);
    }

    // There have three number stream, there are IntStream, LongStream, DoubleStream
    public void testNumber() {
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::print);
        IntStream.range(1, 3).forEach(System.out::print);
        IntStream.rangeClosed(1, 3).forEach(System.out::print);
    }
}
