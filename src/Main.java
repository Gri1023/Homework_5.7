public class Main {
    public static void main(String[] args) {
        // 1 task
        System.out.println("1 task: ");
        System.out.print(prime(7));

        // 2 task
        System.out.println("");
        System.out.println("2 task: ");
        for (int i = 2; i < 100; i++) {
            if (prime(i) == true)
                System.out.print(i + " ");
        }

        // 3 task
        System.out.println("");
        System.out.println("3 task: ");
        int count = 1;
            for (int d = 2; d < 1000; d++) {
                    if (prime(d) == true && count<=100) {
                        System.out.print(d + " " + "count=" + count + "  ");
                        count = count + 1;
                    }
                }
    }
    static boolean prime (int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}