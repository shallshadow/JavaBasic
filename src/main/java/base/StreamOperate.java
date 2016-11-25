/*************************************************************************
	> File Name: src/main/java/base/StreamOperate.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 07:00:06 PM CST
 ************************************************************************/

package java8.base;

import java.util.stream.*;
import java.util.List;

/**
 * Common operate:
 *  Intermediate:
 *    map(mapToInt, flatMap etc.), filter, distinct, sorted, peek, limit, skip, parallel, sequential,
 *    unordered
 *  Terminal:
 *    forEach, forEachOrdered, toArray, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch,
 *    findFirst, findAny, iterator
 *  Short-circuiting:
 *    anyMatch, allMatch, noneMatch, findFirst, findAny, limit
 **/
public class StreamOperate {
    /**
     * turn every string to upper
     * */
    public List<String> toUpper(List<String> wordList) {
        return wordList.stream().
            map(String::toUpperCase).
            collect(Collectors.toList());
    }

    /**
     * sequare every number.
     * */
    public List<Integer> sequare(List<Integer> nums) {
        return nums.stream().map(n -> n * n).
            collect(Collectors.toList());
    }
    
    /**
     * one-to-many
     * */
    public Stream<Integer> flatMap(Stream<List<Integer>> inputStream) {
        return inputStream.flatMap((childList) -> childList.stream());
    }

}
