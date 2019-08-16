import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int row=in.nextInt();
      int count;
      int coun;
      int num=0;
      for(count=1;count<=row;count++)
      {
        for(coun=1;coun<=count;coun++)
        {
          num=num+1;
          if(num%2==1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
        }
        System.out.print("\n");
    }
}
}