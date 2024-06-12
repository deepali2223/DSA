package Extra_Question;

import java.util.Scanner;

public class Euclidian_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(findGCD(num1,num2));
    }

    private static int findGCD(int num1, int num2) {
        while(num1 != 0 && num2 != 0){
            if(num1 > num2){
                num1 = num1 % num2;
            }
            else if(num2 > num1) {
                num2 = num2 % num1;
            }
        }
        return num1 == 0?num2:num1;
    }
}
