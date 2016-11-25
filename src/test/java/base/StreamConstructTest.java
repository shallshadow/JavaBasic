/*************************************************************************
	> File Name: src/test/java/base/StreamConstructTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 03:34:29 PM CST
 ************************************************************************/

package java8.base.test;

import java8.base.StreamConstruct;
import org.junit.Test;
import org.junit.BeforeClass;

public class StreamConstructTest {

    private static StreamConstruct construct; 

    @BeforeClass
    public static void init() {
        construct = new StreamConstruct();
    }
    
    @Test
    public void testCommon() {
        construct.testCommon();
    }

    @Test
    public void testNumber() {
        construct.testNumber();
    }
}
