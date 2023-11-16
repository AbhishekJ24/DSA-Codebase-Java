import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int size=0;
        while (true) {
            int num=sc.nextInt();
            if (num<0)
            break;
            if (size<numbers.length) {
                numbers[size]=num;
                size++;
            } else {
                break;
            }
        }
        if(size!=0){
            int max = Integer.MIN_VALUE;
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                int num = numbers[i];
                if (num < 100) {
                    if (num > max) {
                        max = num;
                        flag = true;
                    }
                }
            }
            if(flag)
            System.out.println(max);
        }
    }
}
