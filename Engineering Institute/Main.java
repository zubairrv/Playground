import java.util.Scanner;
class Faculty
{
  public void salary(int input)
  {
    System.out.println("Base Salary: "+input);
  }
}
class CSE extends Faculty
{
  public void salary(int input)
  {
    System.out.println("CSE Faculty: "+(input+3000));
  }
}
class IT extends CSE
{
  public void salary(int input)
  {
    System.out.println("IT Faculty: "+(input+5000));
  }
}
class ECE extends IT
{
  public void salary(int input)
  {
    System.out.println("ECE Faculty: "+(input+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int input=in.nextInt();
    Faculty fack = new Faculty();
    CSE obj2 = new CSE();
    IT obj3 = new IT();
    ECE obj1 = new ECE();
    fack.salary(input);
     obj2.salary(input);
     obj3.salary(input);
     obj1.salary(input);
    
    
  }
}