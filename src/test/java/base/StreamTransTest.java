/*************************************************************************
	> File Name: /home/shall/work/java/java8/src/test/java/base/StreamTransTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 04:22:56 PM CST
 ************************************************************************/

package java8.base.test;

import java8.base.StreamConstruct;
import java8.base.StreamTrans;

import java.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

public class StreamTransTest {
    private static StreamTrans trans;

    private Stream stream;

    @BeforeClass
    public static void init() {
        trans = new StreamTrans();
    }

    @Before
    public void initStream() {
        stream = Stream.of("a", "b", "c", "d");
    }

    @Test
    public void testList() {
        List<String> list = trans.toList(stream);
        list.stream().forEach(System.out::println);

        stream = Stream.of("1", "2", "3");
        List<String> list2 = trans.toArrayList(stream);
        list2.stream().forEach(System.out::println);
    }

    @Test
    public void testCollection() {
       Set set = trans.toSet(stream);
       set.stream().forEach(System.out::println);
    }

    @Test
    public void testStack() {
        Stack stack = trans.toStack(stream);
        stack.stream().forEach(System.out::println);
    }
    
    @Test
    public void testString() {
        String str = trans.toString(stream);
        System.out.println(str);
    }
}
