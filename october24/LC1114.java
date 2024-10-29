// LC 1114 : Print in Order (Threads)
class Foo {
    int flag = 0;

    public Foo() {

    }

    synchronized public void first(Runnable printFirst) throws InterruptedException { // i made the threads Synchronized

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run(); // flag is zero so it's gonna run first always
        flag++; // now flag is not zero
        notifyAll(); // notifying all other threads
    }

    synchronized public void second(Runnable printSecond) throws InterruptedException {

        while (flag < 1) { // if flag is zero, then wait
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run(); // when flag is not zero, print the "second"
        flag++; // not flag is not 0/1
        notifyAll(); // notifying this to first & third thread
    }

    synchronized public void third(Runnable printThird) throws InterruptedException {

        while (flag < 2) { // if flag is less than 2, then wait
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run(); // now print the "third"
        // now doing the increment & notify here bcoz there's no need...this is the last
        // thread anyways.
    }
}