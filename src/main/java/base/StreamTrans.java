/*************************************************************************
	> File Name: src/main/java/base/StreamTrans.java
	> Author: shall
	> Mail: zyydqpi@163.com
	> Created Time: Fri 25 Nov 2016 04:05:01 PM CST
 ************************************************************************/

package java8.base;

import java.util.stream.*;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;


// Make the stream to relevant Collection.
public class StreamTrans {

    public String[] toArray(Stream stream) {
        return (String[])stream.toArray(String[]::new);
    }

    public List<String> toList(Stream stream) {
        return (List<String>)stream.collect(Collectors.toList());
    } 

    public List<String> toArrayList(Stream stream) {
        return (List<String>)stream.collect(Collectors.toCollection(ArrayList::new));
    }
    
    public Set toSet(Stream stream) {
        return (Set)stream.collect(Collectors.toSet());
    }
    
    public Stack toStack(Stream stream) {
        return (Stack)stream.collect(Collectors.toCollection(Stack::new));
    }

    public String toString(Stream stream) {
        return stream.collect(Collectors.joining()).toString();
    }
}
