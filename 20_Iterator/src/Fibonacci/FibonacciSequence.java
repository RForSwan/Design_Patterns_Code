package Fibonacci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibonacciSequence implements Sequence {
    /*
     * The Fibonacci Sequence is holding all the computed data
     */

    List<Integer> sequence = new ArrayList<>();

    public FibonacciSequence(){
        sequence.add(0);
        sequence.add(1);
    }

    public FibonacciSequence(int[] seed) {
        if(seed.length < 2) throw new IllegalArgumentException("seed must contain at least 2 elements");
        for(int e : seed) {
            sequence.add(e);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }

    @Override
    public int size() {
        return sequence.size();
    }

    @Override
    public int get(int index) {
        return sequence.get(index);
    }

    @Override
    public String toString(){
        return sequence.toString();
    }

    protected void generateNext() {
        int size = sequence.size();
        int ultimate = sequence.get(size - 1);
        int penultimate = sequence.get(size - 2);

        sequence.add(penultimate + ultimate);
    }
}
