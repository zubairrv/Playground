import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int count;
      for(count=1;count<=num;count++)
      {
        if(num%count==0)
        {
          System.out.println(count);
        }
        
	}
}
}