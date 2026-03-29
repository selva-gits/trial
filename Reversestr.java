public class Reversestr {
    public static void main(String[] args){
         String orv = "java";
         String revstr = " ";

         for(int i= orv.length() - 1; i >= 0; --i){
            revstr = revstr + orv.charAt(i);
         }
            System.out.println("Reversed string is: " + revstr);
        }
}
