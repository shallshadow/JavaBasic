/*************************************************************************
	> File Name: src/main/java/base/StreamGroup.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Tue 29 Nov 2016 07:58:49 PM CST
 ************************************************************************/

package java8.base;

import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamGroup {

    // Group the integer list into a map
    public Map<Integer, List<Integer>> groupInt(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(n -> n ));
    }

    // Group the integer list into a map by a boolean conidtion
    public Map<Boolean, List<Integer>> partitionInt(List<Integer> list) {
        return list.stream().collect(Collectors.partitioningBy(n -> n > 2));
    }
}
