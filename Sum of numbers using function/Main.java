import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int total=0;
    for(int i=1;i<=n;i++)
    {
      total=total+i;
    }
    return total;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int g;
      g=sum(num);
      System.out.print(g);
	} 
}