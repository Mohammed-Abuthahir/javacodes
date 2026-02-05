import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class decompressString{
    public static String decompress(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            }
            else{
                int repeat = count == 0 ? 1 : count;
                for(int j = 0;j < repeat;j++){
                    sb.append(ch);
                }
                count = 0;
            }
        }
        return sb.toString();

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = decompress(s);
        System.out.println(result);
    }
}