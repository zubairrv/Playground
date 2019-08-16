import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      for(int r=n;r>=1;r--)
      {
        for(int col=n;col>=1;col--)
        {
          System.out.print(col);
        }
        System.out.print("\n");
        n=n-1;
	}
}
}