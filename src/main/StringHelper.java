package main;

/** A class that contains several methods for manipulating strings */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        int x=0;
        for (int i = 0; i<message.length(); i++) {
            char ch=message.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='y'){
                x++;
            }
        }
        return x;
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message
     * @param shift
     * @return
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {
        if(shift>=26){
            return null;
        }
        int c;
        char check;
        for (int i = 0; i <message.length() ; i++) {
            check=message.charAt(i);
            c=check;
            if(c<65||c>90&&c<97||c>122){
                return null;
            }
        }
        String s="";
        int x=0;

        for (int i = 0; i <message.length() ; i++) {
            char ch=message.charAt(i);
            int ASC=ch+shift;
            char character=(char)ASC;
            s=s+character;
        }
        //TODO: Replace with your code
        return s;
    }

    /** Main method: runs methods of class StringHelper */
    public static void main(String[] args) {
        String s = "hella";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }

}
