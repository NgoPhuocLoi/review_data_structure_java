import java.util.HashMap;

class IsUnique {
    // storage : 26 * 1 byte = 26 bytes
    static boolean isUniqueUsingArray(String str) {
        boolean[] count = new boolean[26];
        for (int i = 0; i < count.length; i++) {
            count[i] = false;
        }

        for (int i = 0; i < str.length(); i++) {
            int c = str.toLowerCase().charAt(i) - 'a';
            if (count[c])
                return false;
            count[c] = true;

        }
        return true;
    }

    static boolean isUniqueUsingHashTable(String str) {
        HashMap<Character, Boolean> count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            boolean isExisted = count.getOrDefault(c, false);
            if (isExisted)
                return false;
            count.put(c, true);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("String 'XinChao' has all unique characters: " + isUniqueUsingArray("XinChao"));
        System.out.println("String 'Xin Chao' has all unique characters: " + isUniqueUsingHashTable("Xin Chao"));
    }
}