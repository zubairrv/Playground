import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=1;
      for(int temp=1;temp<=2*n;temp++)
      {
        if(count%2==1)
        {
          System.out.println(count);
        }
        count=count+1;
	}
}
}