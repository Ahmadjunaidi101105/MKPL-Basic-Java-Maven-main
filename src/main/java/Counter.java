public class Counter {

    private int count;

    public Counter() {
        count = 5;
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
}
