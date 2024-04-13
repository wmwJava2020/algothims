package org.example.search;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnMain {

    private static Integer[] getSumOfTwo(Integer[] arr, int target){
        for(int i = 0; i < arr.length;i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target)
                    return new Integer[] {arr[i],arr[j]};
            }
        }
        return new Integer[]{};
    }

    private static int countVowels(String st){
        String vowels = "a,e,u,o,i";
        int cnt = 0;
       for(int i = 0; i < st.length(); i++){
           char ch = st.charAt(i);
           if(vowels.indexOf(ch)!= -1){
             cnt++;
           }
       }
       return cnt;
    }

    private static int getNumericValueOfString(String sts){
        String st = "s2kr0a76k";

        char[] ch = st.toCharArray();

        int sum= 0;

        for(char c : ch){
            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);
            }
        }
        return  sum;
    }
     public static void main(String[] args) {
         Integer[] number = {3,5,6,7,8,9,0,1};
         int target = 4;

         //Integer[] sumOfTwo = getSumOfTwo(number,target);
         //for(Integer it : sumOfTwo){System.out.println(it);}

         //String vowels = "a,e,u,o,i";
         String st = "Hi how are you welcome to tutorialspoint";
         int vCnt = countVowels(st);

         String sts = "s2kr0a76k";
         int ofString = getNumericValueOfString(sts);
         System.out.println("The value is char is: "+ofString);

     }
}