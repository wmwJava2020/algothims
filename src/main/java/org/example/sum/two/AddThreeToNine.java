package org.example.sum.two;

public class AddThreeToNine {

    private static Integer[] addToNine(Integer[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target)
                    return new Integer[]{num[i], num[j]};
            }
        }

        return new Integer[]{};
    }

    public static void main(String[] args) {
        Integer[] st = {3,5,4,6};
        int target = 9;
        Integer[] nine = addToNine(st, target);
        for(Integer its : nine){

            System.out.println(its);

        }
    }
}
