public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 5;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    // Add the missing methods
    public void increase(int value) {
        count += value;
    }

    public void decrease(int value) {
        count -= value;
    }

    public void multiply(int value) {
        count *= value;
    }
}