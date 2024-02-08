package Strings;
public class RomanToInt {
    public static int convertRoman(String s) {
        int number = 0;
        while (s.length() > 0) {
            if (s.startsWith("M")) {
                number = number + 1000;
                s = s.substring(1);
            }
            if (s.startsWith("CM")) {
                number = number + 900;
                s = s.substring(2);
            }
            if (s.startsWith("D")) {
                number = number + 500;
                s = s.substring(1);
            }
            if (s.startsWith("CD")) {
                number = number + 400;
                s = s.substring(2);
            }
            if (s.startsWith("C")) {
                number = number + 100;
                s = s.substring(1);
            }
            if (s.startsWith("XC")) {
                number = number + 90;
                s = s.substring(2);
            }
            if (s.startsWith("L")) {
                number = number + 50;
                s = s.substring(1);
            }
            if (s.startsWith("XL")) {
                number = number + 40;
                s = s.substring(2);
            }

            if (s.startsWith("X")) {
                number = number + 10;
                s = s.substring(1);
            }
            if (s.startsWith("IX")) {
                number = number + 9;
                s = s.substring(2);
            }
            if (s.startsWith("V")) {
                number = number + 5;
                s = s.substring(1);
            }
            if (s.startsWith("IV")) {
                number = number + 4;
                s = s.substring(2);
            }
            if (s.startsWith("I")) {
                number = number + 1;
                s = s.substring(1);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(convertRoman("MXCIVI"));
    }
}