import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count;
      int sum=0;
      for(count=1;count<=n;count++)
      {
        sum=sum+count;
      }
      System.out.println(sum);
	}
}