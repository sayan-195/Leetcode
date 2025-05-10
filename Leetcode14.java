class Leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int count = s.length();  
        if (strs.length == 1) {
            return s;
        }
    
        for (int i = 1; i < strs.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < Math.min(count, strs[i].length()); j++) {
                if (s.charAt(j) == strs[i].charAt(j)) {
                    tempCount++;
                } else {
                    break;
                }
            }
            count = tempCount; 
            if (count == 0) {
                return "";
            }
        }
    
        return s.substring(0, count);
    }

    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);

    }
}