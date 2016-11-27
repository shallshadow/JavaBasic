/*************************************************************************
	> File Name: src/main/java/base/StreamCollectWords.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sun 27 Nov 2016 01:30:09 PM CST
 ************************************************************************/

package java8.base;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectWords {
    private BufferedReader reader; 
    private String filePath;
    private final String REGEXP = "[^a-zA-Z]";

    public StreamCollectWords(String filePath) {
        this.filePath = filePath;
    }

    /**
     * print all words in the file
     * */
    public List<String> collect() throws FileNotFoundException, IOException {
       reader = new BufferedReader(new FileReader(this.filePath));

       List<String> result = reader.lines().
           flatMap(line -> Stream.of(line.split(REGEXP))).
           filter(word -> word.length() > 0).
           collect(Collectors.toList());
       reader.close();
       return result;
    }

    /**
     * find the longest line's in this file
     * */
    public int longest() throws FileNotFoundException, IOException {
        reader = new BufferedReader(new FileReader(this.filePath));

        int longest = reader.lines().
            mapToInt(String::length).
            max().
            getAsInt();
        reader.close();
        return longest;
    }

    /**
     * find all words and lowwer them, sort them 
     * */
    public List<String> collectSort() throws FileNotFoundException, IOException {
        reader = new BufferedReader(new FileReader(this.filePath));

        List<String> result = reader.lines().
            flatMap(line -> Stream.of(line.split("[^a-zA-Z]"))).
            filter(word -> word.length() > 0).
            map(String::toLowerCase).
            distinct().
            sorted().
            collect(Collectors.toList());
        reader.close();
        return result;
    }
}
