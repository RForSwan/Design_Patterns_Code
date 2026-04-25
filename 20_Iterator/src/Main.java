import Fibonacci.FibonacciSequence;

void main() {
    FibonacciSequence fs1 = new FibonacciSequence();
    Iterator fi1 = fs1.iterator();

    System.out.println(fs1);
    for (int i = 0; i < 10; i++) {
        System.out.println(fi1.next());
    }
    System.out.println(fs1);



    FibonacciSequence fs2 = new FibonacciSequence(new int[]{1, 1});
    Iterator fi2 = fs2.iterator();

    System.out.println(fs2);
    for (int i = 0; i < 10; i++) {
        System.out.println(fi2.next());
    }
    System.out.println(fs2);
}
