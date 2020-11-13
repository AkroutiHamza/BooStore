package STEP1;

public class Order {
   private Double  Unitprice ;
   private int Quantity ;
   
   
public Order() {}
public Order(int quantity, Double unitprice) {
	setQuantity(quantity);
	setUnitprice(unitprice);
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public Double getUnitprice() {
	return Unitprice;
}
public void setUnitprice(Double unitprice) {
	Unitprice = unitprice;
}

double calculateTotalPrice() {
	return Quantity*Unitprice ;
}
@Override
public String toString() {
	return "Order With Quantity" + Quantity + "and Unitprice=" + Unitprice + "TND";
}


/*
public void Display (){
	System.out.println("Order with Quantity"+
" "+DESIGN.CONSOLE_GREEN+
	Quantity + " and Unitprice " + Unitprice+" The total price of your order is "+
    +calculateTotalPrice(this.Quantity, this.Unitprice));
}
*/



   
   
}
