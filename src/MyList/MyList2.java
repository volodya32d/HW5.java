package MyList;

import java.util.ArrayList;
import java.util.List;

public class MyList2<T extends Comparable<T>> {

    List<T> myArr;

    MyList2() {
        myArr = new ArrayList<>();
    }

    public void add(T elem) {
        myArr.add(elem);
    }

    @Override
    public String toString() {
        return "MyList2{" +
                "myArr=" + myArr +
                '}';
    }

    public static <MyList2> void main(String[] args) {

        MyList2 strMyList = new MyList2();
        strMyList.add("Java");
        strMyList.add("Python");
        strMyList.add("C++");
        System.out.println(strMyList);

        MyList2 intMyList;
        intMyList = new MyList2();
        intMyList.add(1232);
        intMyList.add(741);
        intMyList.add(8);
        intMyList.add(452);
        intMyList.add(1);
        System.out.println();

    }

}

