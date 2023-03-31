package MyList;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> array;

    MyList() {
        array = new ArrayList<>();
    }

    public void add(T element) {
        array.add(element);
    }

    public T theLargest() {
        if (array.size() < 1) {
            return null;
        }
        T theLargestElement = array.get(0);
        for (T element : array) {
            if (theLargestElement.doubleValue() < element.doubleValue()) {
                theLargestElement = element;
            }
        }
        return theLargestElement;
    }

    public T theSmallest() {
        if (array.size() < 1) {
            return null;
        }
        T theSmallest = array.get(0);
        for (T element : array) {
            if (theSmallest.doubleValue() > element.doubleValue()) {
                theSmallest = element;
            }
        }
        return theSmallest;
    }

public static void main(String[] args) {
        MyList<Integer> myListInt = new MyList<Integer>();
        myListInt.add(3);
        myListInt.add(54);
        myListInt.add(12);
        myListInt.add(7);
        System.out.println("Largest Int: " + myListInt.theLargest());
        System.out.println("Smallest Int: " + myListInt.theSmallest());

        MyList<Double> myListDouble = new MyList<Double>();
        myListDouble.add(54.24);
        myListDouble.add(8.214);
        myListDouble.add(6.247);
        myListDouble.add(1.235);
        myListDouble.add(5.147);
        System.out.println("Largest Double: " + myListDouble.theLargest());
        System.out.println("Smallest Double: " + myListDouble.theSmallest());

        MyList<Float> myListFlt = new MyList<Float>();
        myListFlt.add(2.35874f);
        myListFlt.add(8.4f);
        myListFlt.add(1.47f);
        myListFlt.add(8.1455f);
        System.out.println("Largest Float: " + myListFlt.theLargest());
        System.out.println("Smallest Float: " + myListFlt.theSmallest());

        MyList<Long> myListLng = new MyList<Long>();
        myListLng.add(150_151_152_154L);
        myListLng.add(511_410_310_210L);
        myListLng.add(123_147_852_123L);
        myListLng.add(21_963_852_741L);
        myListLng.add(2_852_742_123L);
        System.out.println("Largest Long: " + myListLng.theLargest());
        System.out.println("Smallest Long: " + myListLng.theSmallest());
}
}