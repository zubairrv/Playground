import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int sum=0,temp;
      while(number>0)
      {
        temp=number%10;
        sum=sum+temp;
        number=number/10;
      }
      System.out.println(sum);
	}
}