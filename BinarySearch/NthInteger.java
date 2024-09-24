package BinarySearch;

public class NthInteger {
    public static int F(int prod, int power, int mid) {
        long x = 1;
        for (int i = 0; i < power; i++) { // Fixing loop boundary
            x = x * mid;
            if (x > prod) return 2; // If x exceeds prod, return 2
        }
        if (x == prod) return 1; // If exactly equal, return 1
        return 0; // Otherwise, return 0
    }

    public static int R(int prod, int power) {
        int low = 1;
        int high = prod;

        while (low <= high) {
            int mid = (low + high) / 2;
            int Fmid = F(prod, power, mid);
            if (Fmid == 1) {
                return mid;
            } else if (Fmid == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int prod = 36;
        int power = 2;
        System.out.println(R(prod, power)); // This will correctly print 6
    }
}
