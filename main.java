import java.util.Scanner;
public class main{
    static int f(int a,int b){
        Scanner input=new Scanner(System.in);

       if(b==0)
           return 1;

       return a*f(a,b-1);

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("taban sayısını giriniz: ");
        int a= input.nextInt();
        System.out.print("üs sayısını giriniz: ");
        int b= input.nextInt();
        System.out.print(f(a,b));

    }
}
