package lab;

import java.util.ArrayList;

//import java.util.Scanner;

public class shoppingcart {
	
	private static ArrayList<String> items;
	float objectPrice;
	float totalCart;
	
	//Scanner input = new Scanner(System.in);
	
	
	public shoppingcart(){
		
		
	items = new ArrayList<String>();
				
		
	}
	
	public void mycart(){}
	
	public void addItems(String item)
	{
		items.add(item);	
	}
	public void removeItems(String item){
        items.remove(item);
    }

    public void getNumberOfItems(){
        System.out.println(items.size());
    }

    public String getItemName(int index){
        return items.get(index);
    }
    public void getTotalOfCart(){
    	totalCart = 0;
        for(String x: items){
            if (x.equals("A")){
            	totalCart += 3.0;
            }else if (x.equals("B")){
            	totalCart += 5.0;
            }else if (x.equals("C")){
            	totalCart += 2.50;
            }
        }
        System.out.println(totalCart);
    }

	
	
	
	

}
