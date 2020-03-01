import java.util.HashSet;
import java.util.Set;

public class Candy {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum = 0;
        int sum2 = 0;
        Set<Integer> bobSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        for (int i = 0; i < B.length; i++) {
            bobSet.add(B[i]);
            sum2 += B[i];
        }

        int equalShare = (sum2 - sum ) /2;
        int[] ans = new int[2];
        for (int i = 0; i < A.length; i++) {
            
            if (bobSet.contains(A[i] + equalShare)) {
                ans[0] = A[i];
                ans[1] = A[i] + equalShare;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}