import java.util.Scanner;
class Arithematic
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter Two Number....");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("addition"+(a+b));
        System.out.println("substraction"+(a-b));
    }
}
