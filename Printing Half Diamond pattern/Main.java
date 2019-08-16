import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int r=1;r<=n;r++)
      {
        for(int s=1;s<=(n-r);s++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=r;col++)
        {
          System.out.print("*");
        }
        for(int sol=2;sol<=r;sol++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
	}
}
}