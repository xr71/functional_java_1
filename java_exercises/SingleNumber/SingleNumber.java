import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int solution(int[] nums) {

        Map<Integer, Integer> hm = new HashMap<>();
        int cnt = 0;

        for (int n : nums) {
            if (hm.containsKey(n)) {
                hm.put(n, hm.get(n) + 1);
            } else {
                hm.put(n, 1);
            }
        }

        System.out.println(hm);

        for (int i : hm.keySet()) {
            if (hm.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] mynums = { 2, 2, 7, 5, 4, 4, 3, 5, 3, 3, 5, 3 };

        int x = solution(mynums);
        System.out.println(x);
    }
}