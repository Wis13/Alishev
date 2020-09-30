package com.vadym.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        int idx = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (idx == 1)
                iterator.remove();

            idx++;
        }
        System.out.println(list);

//        for (int x : list) {
//            System.out.println(x);
//        }
    }
}
