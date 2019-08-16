import java.util.Scanner;
class Main
{
  public static void prime(int n)
  {
    int numbers;
    System.out.println("2");
    System.out.println("3");
     for(numbers=3;numbers<n;numbers++)
     {
       if(numbers%2!=0&&numbers%3!=0)
       {
         System.out.println(numbers);
       }
  }
    }
  
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int total=in.nextInt();
    prime(total);
  }
}