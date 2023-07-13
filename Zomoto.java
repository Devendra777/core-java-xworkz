class Zomoto {
  
  // method Overloading
  
     //implementation
      public static double search(String foodName){
	   //   "Pizaa" == "Pizza"
	      if( "Pizza"  == foodName){  
		  System.out.println("Searchd food  name is "+ foodName);
		    return 99.00 ; 
		  }
		  
		  //"Veg Biryani" == "Veg Biryani"
		  if("Veg Biryani" == foodName){
		  System.out.println("Searchd food  name is "+ foodName);
		    return 245.90 ; 
		  }
		 
		  return 0.0;
		  //20
	}
	
	     public static double search(String foodName , int quantity){
	   //   "Pizaa" == "Pizza"
	      if( "Pizza"  == foodName){  
		  System.out.println("Searchd food  name is "+ foodName);
		    return 99.00 * quantity ; 
		  }
		  
		 // "Veg Biryani" == "Veg Biryani"
		  if("Veg Biryani" == foodName){
		  System.out.println("Searchd food  name is "+ foodName);
		    return 245.90 * quantity ; 
		  }
		 
		  return 0.0;
		  //20
	}




}