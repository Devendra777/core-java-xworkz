class ZomatoTester{


    public static void main(String foodDelivery[]){
	
	// external Referening
	  String fName = "Pizza";
	
 double priceofFoodName = Zomoto.search(fName);
	   
	   System.out.println("The food Price is"+ priceofFoodName);
double priceWithGivenQuantity = Zomoto.search("Pizza", 5);
		    System.out.println("The food Price with Quantity "+ priceWithGivenQuantity);
	}
}

