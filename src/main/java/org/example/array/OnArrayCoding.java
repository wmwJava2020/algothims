/**
 * @author Admin01
 * @Date 9/28/2024
 */
package org.example.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OnArrayCoding {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, -6, 10, 5, -1, 7, 9, -8, 2, 8, 15,-10 , 0, 6, -4};
                   // 0   1  2  3  4  5  6 7 8 9 10 11  12 13 14 15 16 17  18  19
        //int[] arr = {-10,-8,-6,-4,-3,-2,-1,0,1,2, 3, 4,  5, 6, 7, 8, 9, 10, 15, 16};
        int TARGET = 1;
        //searchSumOfTwoBinarySearch(arr,TARGET);
        int indS = 3;
        int indE = 13;
        int TARGET0 = 14;
        //getSatrtAndEndOfArray(arr, indS,indE,TARGET0);

       //sortArrayObject(arr);

        char[] CHARS = {'a','e','r','y','d','1','9','w','A','Z','z','a','a','a','1'};
        //sortCharsArrays(CHARS);

        char ch = 'K';
        //System.out.println("Character : "+isVowelLetters(ch));

        char c = 'p';
        //System.out.println(isVowelOrConsonant(c));

        //countNonEmptyString();

        //nullAndEmptyCheck();

        //findMaxAndMinNumbers();

        reversStringUsingStream();

    }

    private static void searchSumOfTwoBinarySearch(int[] arr, int target){
        int binaried = Arrays.binarySearch(arr, target);
        System.out.println("binaried: "+binaried);
    }

    private static void getSatrtAndEndOfArray(int[] arr, int indexS, int indexE, int target){
        int binariedSearch = Arrays.binarySearch(arr, indexS, indexE, target);
        System.out.println("Bn-indexes : "+binariedSearch);
    }

    private static void sortArrayObject(int[] arr){
        Arrays.sort(arr);
        for(int XRs : arr){
            System.out.print(" "+XRs);
        }

    }

    private static void sortCharsArrays(char[] CHARs){
        Arrays.sort(CHARs);
        for(char RsR : CHARs){
            System.out.print(" "+RsR);
        }
    }

    private static boolean isVowelLetters(char ch){
        ch = Character.toLowerCase(ch);
       return "aeiou".indexOf(ch)!= -1;
    }

    private static boolean isVowelOrConsonant(char ch){
      String vl = "AEIOUaeiou";
      return vl.indexOf(ch) != -1;
    }

    private static void countNonEmptyString(){
        List<String> str = Arrays.asList("","jack", "mack","","test","","hack","Luke","mark","","zack");

        Predicate<String> empty = String::isEmpty;

        long cnt = str.stream().filter(empty.negate()).count();
        System.out.println(cnt);

    }

    private static void nullAndEmptyCheck(){
        Predicate<String> nullCheck = arg-> arg != null; // is not NULL
        Predicate<String> empty = arg -> arg.length() > 0;
        Predicate<String> checkNullAndEmpty = nullCheck.and(empty); // in evaluating composed predicate, if 1st predicate is false, then 2nd predicate is not evaluated
        System.out.println(checkNullAndEmpty.test("test")); // 1st T and 2nd T = T
        System.out.println(checkNullAndEmpty.test(null));  // 1st T and 2nd F = F
    }

    private static void findMaxAndMinNumbers(){

        List<Integer> nums = Arrays.asList(22,9,90,54,32,10,55,87,42,100,77,59,17);
        //nums.stream().sorted().forEach(s-> System.out.print(s+" "));

        Integer orElse = nums.stream().findAny().orElse(78); // return value orElse the 1st value
        //System.out.print(orElse);

        Integer max = nums.stream().max(Comparator.naturalOrder()).get();
        System.out.println("MAX:"+max);

        Integer min = nums.stream().min(Comparator.naturalOrder()).get();
        System.out.println("MIN:"+min);

    }

    private static void reversStringUsingStream(){

        String str= "we can make our world better";

        String[] words = str.split(" "); // convert string into an array

        List<String> stringList = Arrays.stream(words) // convert arrays to map
                .map((word) -> new StringBuilder(word).reverse().toString()) // using SB revers text, convert to string and map
                .collect(Collectors.toList()); // collect reversed text
        System.out.println(stringList);


    }
}
