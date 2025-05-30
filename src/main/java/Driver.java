public class Driver {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Hitung:" + counter.getCount());
        
        counter.increase(5);
        
        System.out.println("Hitung:" + counter.getCount());
        
        counter.decrease(2);
        
        System.out.println("Hitung:" + counter.getCount());
        
        counter.multiply(6);
    }

}
