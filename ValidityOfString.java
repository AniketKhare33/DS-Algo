import java.util.Scanner;
public class ValidityOfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                count1++;
            }
            else if(s.charAt(i)=='#'){
                count2++;
            }
        }
        System.out.println(Math.abs(count1-count2));
    }
}
