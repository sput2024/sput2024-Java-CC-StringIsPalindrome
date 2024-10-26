
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        Boolean value = true;
        int k = str.length();
        String reversedString = "";
    
        for (int i = k-1;i>=0;i--){
         //   System.out.println(i);
         //if (str.substring(i-d,i).equals(str.substring(i+d,i+d+1))==false){
         //   System.out.println(str.substring(i-1,i));
         //   d = d+1;
         //   value = false;
         //   return false;
         reversedString = reversedString + str.charAt(i);

         }
        // if (str.substring(i-d,i).equals(str.substring(i+d,i+2))){
         //   d = d+1;
         //   value = true;
         //   System.out.println("true");
           
         System.out.println(reversedString);
         System.out.println(str);
         if(reversedString.equals(str)==true){
            value = true;
           
        }
        else 
        value = false;

        return value;
    }
}
