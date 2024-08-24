
// recursion
// function call itself like a loop

class box9 {
    int num(int n) {
        if (n == 0) {
            return -1;
        } else {
            return n * num(n - 1);
        }
    }
}