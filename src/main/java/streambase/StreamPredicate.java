/*************************************************************************
	> File Name: src/main/java/streambase/StreamPredicate.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sat 03 Dec 2016 06:58:55 PM CST
 ************************************************************************/

package java8.streambase;


import java.util.function.Predicate;
import java.util.List;

/**
 * We can even combine Predicate using and(), or() and xor() logical functions for
 * example to find names, which starts with J and four letters long, you can pass
 * combination of two Predicate
 * */
public class StreamPredicate {
   Predicate<String> startsWithJ = (n) -> n.startsWith("J");
   Predicate<String> fourLetterLong = (n) -> n.length() == 4;
   Predicate<String> fiveMoreLong = (n) -> n.length() >= 5;

   public void test(List<String> names) {
       names.stream().filter(startsWithJ.and(fourLetterLong).or(fiveMoreLong)).
           forEach((n) -> System.out.println("\n Name, which starts with 'J' and four letter long is : " + n));
   }
}

