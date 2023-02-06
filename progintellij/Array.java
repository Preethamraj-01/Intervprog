import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {


    //1. Rotate Array by k times

    public void rotate(int[] nums, int k) {


        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];

        }


    }

    //2.. Rotate and delete last index

    public static int rotateDelete(ArrayList<Integer> arr, int n) {

        // Your code here

        int i = 1;
        while (n > 1) {
            arr.add(0, arr.remove(n - 1));
            int a = n - i++;
            if (a < 0)
                a = 0;
            arr.remove(a);
            n = arr.size();
        }

        return arr.get(0);
    }


    //3.Add to Array-Form of Integer
    public List<Integer> addToArrayForm(int[] num, int k) {

        int A[] = num;
        int K = k;

        int N = A.length;
        // int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || k > 0) {
            if (i >= 0)
                k += A[i];
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;

    }


    //4.. Count and Say


    public String countAndSay(int n) {


        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        int i = 0;
        int j = 1;
        while (j <= s.length()) {
            if (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
                cnt++;
            } else {
                sb.append(cnt);
                sb.append(s.charAt(i));
                cnt = 1;
                i = j++;
            }
        }
        return sb.toString();
    }



    //5. gcd of two numbers

    public int gcd(int A , int B)
    {
        //code here

        if(B==0)return A;

        return gcd(B,A%B);
    }


}