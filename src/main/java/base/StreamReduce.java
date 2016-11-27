/*************************************************************************
	> File Name: src/main/java/base/StreamReduce.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Sun 27 Nov 2016 08:51:46 PM CST
 ************************************************************************/

package java8.base;

import java.util.stream.Stream;
import java.util.Arrays;

/**
 * The reduce operation is group every element with BinaryOperator and the init seed.
 * */
public class StreamReduce {

    public String concat(String[] args) {
        return Arrays.stream(args).reduce("", String::concat);
    }

    public double min(double[] values) {
        return Arrays.stream(values).reduce(Double.MAX_VALUE, Double::min);
    }

    public int sum(int[] datas) {
        return Arrays.stream(datas).reduce(0, Integer::sum);
    }

    public int sumWithNoBeginNumber(int[] datas) {
        return Arrays.stream(datas).reduce(Integer::sum).getAsInt();
    }

    public String filterConcat(String[] args) {
        return Arrays.stream(args).
            filter(x -> x.compareTo("Z") > 0).
            reduce("-", String::concat);
    }
}
