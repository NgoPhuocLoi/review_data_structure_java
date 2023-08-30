import java.util.HashMap;

public class CheckPermutation {

    static boolean checkPermutation(String sourceStr, String checkStr) {
        HashMap<Character, Integer> map = new HashMap<>();
        sourceStr = sourceStr.toLowerCase();
        checkStr = checkStr.toLowerCase();

        for (int i = 0; i < sourceStr.length(); i++) {
            char c = sourceStr.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < checkStr.length(); i++) {
            char c = checkStr.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        int sum = 0;
        for (int num : map.values()) {
            if (num < 0)
                return false;
            sum += num;
        }

        return sum == 0;
    }

    public static void main(String[] args) {
        System.out.println("Check 'abccba' is a permutaion of 'aabbcc' : " + checkPermutation("aabbcc", "abccba"));
    }
}
