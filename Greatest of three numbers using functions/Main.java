import java.util.Scanner;
class Main{
  public static void big(int a,int b,int c)
  {
    int great;
    if(a>b)
    {
      great=a;
    }
    else 
    {
      great=b;
    }
    if(great>c)
    {
      great=great;
    }
    else 
    {
      great=c;
    }
    System.out.println(great);
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      big(n1,n2,n3);
	}
}