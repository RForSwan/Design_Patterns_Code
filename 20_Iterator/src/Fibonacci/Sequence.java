package Fibonacci;

import java.util.Iterator;

public interface Sequence {
    Iterator<Integer> iterator();
    int size();
    int get(int index);
    String toString();
}
