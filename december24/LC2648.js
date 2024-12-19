// LC 2648 : Generate Fibonacci Sequence

var fibGenerator = function*() {    //* Marks a Function as a Generator
    let a = 0, b = 1;
    while (true) {
        yield a;                    //yield Pauses Execution and Produces a Value
        [a, b] = [b, a + b];
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0               //.next() Resumes Execution
 * gen.next().value; // 1
 */