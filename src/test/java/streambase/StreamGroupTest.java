/*************************************************************************
	> File Name: src/test/java/base/StreamGroupTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Tue 29 Nov 2016 08:06:19 PM CST
 ************************************************************************/

package java8.streambase.test;

import java.util.Map;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;
import java8.streambase.StreamGroup;

public class StreamGroupTest {
    private StreamGroup group = new StreamGroup();

    @Test
    public void testGroup() {
        List<Integer> ls = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8);
        Map<Integer, List<Integer>> map = group.groupInt(ls);
        System.out.println("Map : " + map);


        Map<Boolean, List<Integer>> map2 = group.partitionInt(ls);
        System.out.println("Partition : " + map2);
        
    }
}
