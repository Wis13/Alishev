package com.vadym.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {


    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<Integer>();
        fillArr(arr1);
        fillList(list1);

        // map method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());
        System.out.println(Arrays.toString(arr1));

        arr1= Arrays.stream(arr1).map(a->3).toArray();
        System.out.println(Arrays.toString(arr1));
        arr1= Arrays.stream(arr1).map(a->a+1).toArray();


        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);

        //filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2=Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a%2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);
        //forEach
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

        // reduce
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum1 = Arrays.stream(arr3).reduce(Integer::sum).getAsInt();
        int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(sum2);



  }
  public static void fillArr(int[] arr) {

        for (int i = 0; i < 10; i++){
            arr[i] = i + 1;

        }

  }
  public static void fillList(List<Integer> list){

        for (int i=0; i< 10; i++){
            list.add(i + 1);
        }
  }
}
