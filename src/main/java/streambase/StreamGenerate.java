/*************************************************************************
	> File Name: src/main/java/base/StreamGenerate.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Mon 28 Nov 2016 11:43:48 AM CST
 ************************************************************************/

package java8.streambase;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.function.Supplier;

import java.util.Random;

public class StreamGenerate {
    private Random seed = new Random();

    public void work() {
        Supplier<Integer> random = seed::nextInt;
        Stream.generate(random).
            limit(10).
            map(n -> n % 100).
            forEach(System.out::println);
    }

    public void work2() {
       IntStream.generate(() -> ((int)System.nanoTime() % 100)).
           limit(10).
           forEach(System.out::println);
    }

    public void work3() {
        Stream.generate(new MySupplier()).
            limit(10).
            forEach(p -> System.out.println("My Supplier : " + p));
    }


    public void iterate() {
        Stream.iterate(0, n -> n + 3).
            limit(10).
            forEach(x -> System.out.print(x + " "));
    }

    private class MySupplier implements Supplier<Integer> {
        private Random random = new Random();

        @Override
        public Integer get() {
            return random.nextInt(100);
        }
    }
}
