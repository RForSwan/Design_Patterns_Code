package Fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private FibonacciSequence fs;
    private int currIndex;


    public FibonacciIterator(FibonacciSequence fs) {
        this.fs = fs;
    }

    @Override
    public boolean hasNext() {
        return currIndex != fs.size();
    }

    @Override
    public Integer next() {
        currIndex++;
        if (!hasNext()) {
            fs.generateNext();
        }
        return fs.get(currIndex);
    }


}
