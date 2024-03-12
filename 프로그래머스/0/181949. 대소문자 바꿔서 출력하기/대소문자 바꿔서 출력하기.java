import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] str = a.toCharArray();
        int[] num = new int[str.length];
        
        
        
        for(int i=0; i<str.length; i++) {
            num[i] = str[i];
        }
        for(int i=0; i<num.length; i++) {
            if(num[i]>= 65 && num[i] <=90) {
                num[i] +=32;
            } else if(num[i]>=97 && num[i]<=122) {
                num[i] -=32;
            }
        }
               
        for(int i=0; i<str.length; i++) {
            str[i] = (char) num[i];
        }
        
        for(int i=0; i<str.length; i++) {
            System.out.print(str[i]);
        }
        
    }
}