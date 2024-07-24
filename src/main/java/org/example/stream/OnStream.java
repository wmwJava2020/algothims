/**
 * @author Wondafrash
 * @Date 7/23/2024
 */
package org.example.stream;

public class OnStream {

    public static void main(String[] args) {

        countWordsInString("We can Do That");
        String reveres = reveresString("Wondafrash");
        System.out.println(reveres);
         convertStringToArray("Wondu");

    }

    private static void countWordsInString(String string){
        int cntWord = string.split("\\s").length;
        System.out.println(cntWord);
    }

    private static String reveresString(String str){
        String reveresedString = "";
        for(int i = 0; i < str.length(); i++){
            reveresedString = str.charAt(i) + reveresedString;
        }
        return reveresedString;
    }

    private static void convertStringToArray(String str){
        char[] myChar = str.toCharArray();
        System.out.println(myChar[0]);

    }
}
