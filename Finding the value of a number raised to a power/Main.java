import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      int prod=1;
      while(exponent>0)
      {
         prod=prod*base;
        exponent--;
      }
      System.out.println(prod);
    }
}

   