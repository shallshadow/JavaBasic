/*************************************************************************
	> File Name: src/test/java/base/StreamGenerateTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Mon 28 Nov 2016 11:50:43 AM CST
 ************************************************************************/

package java8.base.test;

import org.junit.Test;

import java8.base.StreamGenerate;


public class StreamGenerateTest {

    @Test
    public void test() {
        StreamGenerate generate = new StreamGenerate();

        System.out.println("work : ");
        generate.work();

        System.out.println("work2 : ");
        generate.work2();

        System.out.println("work3 : ");
        generate.work3();

        System.out.println("iterate : ");
        generate.iterate();
    }
}
