public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void increase(int amount) {
        count += amount;
    }

    public void decrease(int amount) {
        count -= amount;
    }

    public void multiply(int factor) {
        count *= factor;
    }

    public int getCount() {
        return count;
    }
    
}