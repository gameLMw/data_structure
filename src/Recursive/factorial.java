package Recursive;

public class factorial {
    public static void main(String[] args) {
        System.out.println(recursive(3));
    }

    private static int recursive(int n){
        if (n == 1){
            return 1;
        }
        int sum = n * recursive(n-1);
        return sum;
    }
}
