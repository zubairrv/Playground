import java.util.Scanner;
class Main
{
  public static int power(int b,int exp)
  {
    int pow=1;
    while(exp!=0)
    {
    pow=pow*b;
    exp--;
    }
    return pow;
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int powe;
    powe=power(base,exponent);
    System.out.print(powe);
  }
}
