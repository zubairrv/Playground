import java.util.Scanner;
class Item
{
  public int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
}
   
class Customer extends Item
{
  private String product;
  public int quantity;
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
}

class Bill extends Customer
{
   public void display(){
 
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int price1=in.nextInt();
    int quantity1=in.nextInt();
    Item i = new Item();
    i.setPrice(price1);
    Customer c = new Customer();
    c.setQuantity(quantity1);
    Bill obj = new Bill();
    obj.display();
     System.out.println("Total Price is : "+(quantity1*price1));
  }
}