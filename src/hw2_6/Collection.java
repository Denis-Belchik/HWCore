package hw2_6;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0)
                System.out.println(num);
        }
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 8, 8, 10, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 6, 70, 70));
        Collections.sort(nums);

        Integer temp = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 && !temp.equals(num)) {
                temp = num;
                System.out.println(temp);
            }
        }

    }

    private static void task3() {
        List<String> stringList = new ArrayList<>(List.of("qaz", "wsx", "qaz", "qaz", "edc", "wsx"));
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringSet);
    }

    private static void task4() {
        List<String> stringList = new ArrayList<>(List.of("qaz", "wsx", "qaz", "qaz", "edc", "wsx"));
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringList.size() - stringSet.size());
    }


}
