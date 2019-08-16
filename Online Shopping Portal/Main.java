public class Main {
	public static void main(String[] args) {
		Customers Obj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
		Customers Obj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
		Suppliers supObj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Suppliers supObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		Obj1.displayProfileDetails();
		Obj2.displayProfileDetails();
		supObj1.displayProfileDetails();
		supObj2.displayProfileDetails();
		Obj1.editAddress("Coimbatore");
		supObj1.editAddress("Delhi");
		Obj1.placeOrder();
		supObj1.increaseStockLevel(5);
		supObj2.increaseStockLevel(10);
		
	}
}

class Users {
	int id;
	String name;
	long mobileNumber;
	String address;
	
	public void editAddress(String newAddress) {
		System.out.println(name+", "+address);
		address = newAddress;
		System.out.println(name+", "+address);
	}
	
	public void displayProfileDetails(){
		System.out.println(name+", "+mobileNumber);
	}
}

class Customers extends Users{
	String dateOfBirth;
	char gender;
	String orderHistory;
	
	public Customers(int id,String name,long mobileNumber,String address, String dateOfBirth,char gender,String orderHistory) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.orderHistory = orderHistory;
	}
	
	public void placeOrder() {
		System.out.println("Order placed successfully!");
	}
}

class Suppliers extends Users {
	int itemStock;
	String paymentStatus;
	float feedbackRating;
	
	public Suppliers(int id,String name,long mobileNumber,String address,int itemStock,String paymentStatus,float feedbackRating) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.itemStock = itemStock;
		this.paymentStatus = paymentStatus;
		this.feedbackRating = feedbackRating;
	}
	
	public void increaseStockLevel(int newStock) {		
		System.out.println(name+", "+(itemStock+newStock));		
	}
}
