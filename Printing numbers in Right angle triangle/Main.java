import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
  		int total=in.nextInt();
      int count;
      int coun;
      int num=0;
      for(count=1;count<=total;count++)
      {
         num=num+1;
        for(coun=1;coun<=count;coun++)
        {
          System.out.print(num);
        }
        System.out.print("\n");
	}
}
}