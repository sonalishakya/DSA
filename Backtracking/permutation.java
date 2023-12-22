package PrepDSA.Backtracking;

/**
 * @author: sonali.shakya
 */


// TC --> O(n!)
public class permutation {
   public static void main(String[] args) {
       String s = "abc";
       permute(s.toCharArray(), 0);
   }

   static void permute(char[] ch, int i) {
       if (i >= ch.length) {
           System.out.println(String.valueOf(ch));
           return;
       }

       for (int j = i; j < ch.length; j++) {
           swap(ch, i, j);
           permute(ch, i+1);
           swap(ch, i, j);
       }
   }

   static void swap(char[] ch, int i, int j) {
       char temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
   }
}

