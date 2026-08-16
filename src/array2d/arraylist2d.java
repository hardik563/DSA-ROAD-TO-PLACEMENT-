package array2d;

import java.util.*;

public class arraylist2d {
        public static void main(String[] args) {

            List<Integer> a = new ArrayList<>();
            a.add(10);
            a.add(20);
            a.add(30);

            List<Integer> b = new ArrayList<>();
            b.add(40);
            b.add(50);

            List<Integer> c = new ArrayList<>();

            List<Integer> d = new ArrayList<>();
            d.add(60);

            List<List<Integer>> l = new ArrayList<>();
            l.add(a);
            l.add(b);
            l.add(c);
            l.add(d);

            System.out.println(l);
        }
    }