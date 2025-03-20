


import java.util.Scanner;

public class Diffi{
   
    public static int algo(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
           
            base = (base * base) % mod;
            exp = exp >> 1; 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.print("Enter the value of g: ");
        int g = sc.nextInt();
        System.out.print("Enter the value of XA: ");
        int xa = sc.nextInt();
        System.out.print("Enter the value of XB: ");
        int xb = sc.nextInt();
        sc.close();
        

      
        int ya = algo(g, xa, p);
        int yb = algo(g, xb, p);

        System.out.println("Value of YA: " + ya);
        System.out.println("Value of YB: " + yb);

       
        int k1 = algo(yb, xa, p);
        int k2 = algo(ya, xb, p);

        System.out.println("Secrate key A: " + k1);
        System.out.println("Secreate key  B: " + k2);
    }
}