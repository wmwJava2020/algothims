/**
 * Created by:Wondafrash
 * Date : 7/22/2024
 * Time : 4:26 PM
 */
package org.example.GfG;

public class GfGOnString {

    public static void main(String[] args) {
        String str = "wondafrash";
        String s = reversString(str);
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c).append((char) (c + 32));
        }

        System.out.println(sb);
    }

    static String reversString(String str) {
        String rs = "";

        for (int i = 0; i < str.length(); i++) {
            rs = str.charAt(i) + rs;
        }
        return rs;
    }

}
