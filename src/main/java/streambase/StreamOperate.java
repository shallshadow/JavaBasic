/*************************************************************************
	> File Name: src/main/java/base/StreamOperate.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 07:00:06 PM CST
 ************************************************************************/

package java8.streambase;

import java.util.stream.*;
import java.util.List;
import java.util.Optional;

/**
 * Common operate:
 *  Intermediate:
 *    map(mapToInt, flatMap etc.), filter, distinct, sorted, peek, limit, skip, parallel, sequential,
 *    unordered
 *  Terminal:
 *    forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch,
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

    /**
     * filter the odd nums in the arrays
     * */
    public Integer[] filterOdd(Integer[] nums) {
        return Stream.of(nums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
    }

    /**
     * peek, peek operate every element and return a new stream
     * */
    public List<String> peek(List<String> list) {
        return list.stream().
            filter(e -> e.length() > 3).
            peek(e -> System.out.println("Filtered value : " + e)).
            map(String::toUpperCase).
            peek(e -> System.out.println("Mapped value : " + e)).
            collect(Collectors.toList());
    }

    /**
     * findFirst
     * */
    public void printWithNoNull(String text) {
        Optional.ofNullable(text).ifPresent(System.out::println);
        int length = Optional.ofNullable(text).map(String::length).orElse(-1);
        System.out.println("The text length is " + length);
    }

    
}
