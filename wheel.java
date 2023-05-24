import java.util.Scanner;
public class wheel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        if(w>=2 && (w%2==0) && v<w){
            int x = (w- 2*v)/2;
            int y = v-x;
            System.out.println("tw"+y+" "+"fw"+x);

        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
        
    }
}