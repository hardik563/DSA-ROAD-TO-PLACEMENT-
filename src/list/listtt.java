package list;

import java.util.*;

public class listtt {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 4, 10, 9, 8, 7));

        System.out.println("elements: " + list);

        Collections.sort(list);
        System.out.println("Ascending order: " + list);


        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order: " + list);
    }
}






/*import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Ascending - Brute Force
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Ascending: " + list);

        // Descending - Brute Force
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Descending: " + list);
    }
}*/