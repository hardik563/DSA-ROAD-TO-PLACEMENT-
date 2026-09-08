package RECURSION;

public class stairpath {
    public  static int stairs(int n){
          if(n<=2) return n;
          return stairs(n-1)+stairs(n-2);

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(stairs(n));


    }
}

