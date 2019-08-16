
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int number=in.nextInt();
       int rows,columns,i,j;
      rows=number;
      columns=number;
      for(i=1;i<=rows;i++)
      {
        for(j=1;j<=columns;j++)
        {
          if(i==1||i==rows||j==1||j==columns)
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }
    }
}
