package lab;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shoppingcart cart = new shoppingcart();
		
		cart.addItems("watches");
		cart.addItems("bags");
		cart.addItems("cars");
		cart.addItems("bikes");
		cart.addItems("clothes");
		
		cart.getNumberOfItems();
		

	}

}
