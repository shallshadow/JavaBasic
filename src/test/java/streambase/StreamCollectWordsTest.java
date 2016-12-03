/*************************************************************************
	> File Name: src/test/java/base/StreamCollectWordsTest.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sun 27 Nov 2016 02:55:35 PM CST
 ************************************************************************/

package java8.streambase.test;

import org.junit.Test;
import org.junit.BeforeClass;
import java8.streambase.StreamCollectWords;
import java.util.List;
import java.io.*;

public class StreamCollectWordsTest {
   private static StreamCollectWords collect;

   @BeforeClass
   public static void init() {
       collect = new StreamCollectWords("//home//shall//work//java//java8//build.gradle");
   }

   @Test
   public void testCollect() throws FileNotFoundException, IOException {
       List<String> words = collect.collect();
       System.out.println(words);
   }


   @Test
   public void testLongest() throws FileNotFoundException, IOException {
       System.out.println(" The longest line's length is " + collect.longest());
   }

   @Test
   public void testCollectSort() throws FileNotFoundException, IOException {
       List<String> words = collect.collectSort();
       System.out.println(words);
   }
}
