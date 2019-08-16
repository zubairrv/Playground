import java.util.Scanner;
public class Main{
  public static void gcd(int a,int b,int c)
  {
    int small=0;
    int small2=0;
    int gcd1=0,gcd2=0;
    if(a>b||a==b)
    {
      small=b;
    }
      else 
      {
        small=a;
      }
    while(small>=1)
    {
      if((a%small)==0&&(b%small==0))
      {
        gcd1=small;
               break;
      }
      small--;
    }
    int d=gcd1;
       if(c>d||c==d)
    {
      small2=d;
    }
      else 
      {
        small2=c;
      }
    while(small2>=1)
    {
      if((c%small2==0) && (d%small2==0))
      {
         gcd2=small2;
        break;
      }
      small2--;
    }
    System.out.println(gcd2);
  }

	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      gcd(n1,n2,n3);
	}
}