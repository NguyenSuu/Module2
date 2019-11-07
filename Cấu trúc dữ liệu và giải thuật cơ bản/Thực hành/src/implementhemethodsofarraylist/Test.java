package implementhemethodsofarraylist;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> test=new MyList<>();
        test.addValue(254);
        test.addValue(653);
        test.addValue(6);
        test.addValue(4);
        test.addValue(5);
        test.addValue(123);
        test.addValue(8);
        test.addAtIndex(3,6);
        test.addAtIndex(6,1);
        test.addAtIndex(10,0);
        test.print();
        System.out.println(test.getSize());
        System.out.println(test.contains(254));
        test.clear();
        test.print();
        System.out.println(test.getSize());
        test.addAtIndex(3,6);
        test.print();
        System.out.println(test.contains(4));
        System.out.println(test.getSize());
    }
}
