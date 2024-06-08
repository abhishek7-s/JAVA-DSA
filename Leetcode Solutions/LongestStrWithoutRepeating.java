public class LongestStrWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabc";
        String Ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {

                Ans += s.charAt(i);
               if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.substring(i, j));
                    System.out.println(Ans.length() +" is length ");
                    Ans = "";
               }
            }
        }
    }    
}
