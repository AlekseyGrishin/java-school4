import service.impl.CountMapImpl;

public class Main {
    public static void main(String[] args) {
        CountMapImpl<Integer> countMap1 = new CountMapImpl<>();
        countMap1.add(4);
        countMap1.add(3);
        countMap1.add(1);
        countMap1.add(1);
        System.out.println(countMap1.size());
        countMap1.remove(1);
        System.out.println(countMap1.size());


        CountMapImpl<Integer> countMap2 = new CountMapImpl<>();
        countMap2.add(5);
        countMap2.add(6);
        countMap2.add(7);
        countMap2.add(8);
        countMap1.addAll(countMap2);
        System.out.println(countMap1.size());
        System.out.println(countMap1.toMap());
        countMap1.toMap();
    }
}
