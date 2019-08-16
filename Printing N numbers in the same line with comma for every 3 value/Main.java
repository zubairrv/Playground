import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int start;
    for(start=1;start<=n;start++)
    {
      System.out.print(start);
      if(start%3==0)
      {
        System.out.print(",");
      }
  }
}
}