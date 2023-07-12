class Stationary {
   static String  stationaryItems[]  = {null , null , null , null ,null , null , null , null};
		static	int index = 0 ; 

       public static boolean addStationaryItems(String itemName){
	      System.out.println("Invoking addStationaryItems");
		   System.out.println("No Of Parameters : 1 , type of parameter : String");
		   boolean isAdded  = false;
		   if(itemName != null){
		           if(index < stationaryItems.length ){
	           stationaryItems[index++]   =   itemName ; 
				   isAdded  =true ;
		   }else{
			 System.out.println("Oh...Elli Jaaga full agide");
		   }
		        
		   }else{
		    
		   }System.out.println("itemName cannot be null");
	   
	   return isAdded ; 
	   }			
				

public static void  getAllStationaryItems(){
	System.out.println("List of StationaryItems are:");
	for( String itemName  : stationaryItems){
		System.out.println(itemName);
	}
}		

public static  boolean editStationaryItemName(String updatedItemName , String existingItemName ){
	   System.out.println("Invoking editStationaryItemName");
		   System.out.println("No Of Parameters : 2 , type of parameter : String , String");
		   boolean isUpdated = false ; 
		   for(int itemIndex = 0 ;  itemIndex < stationaryItems.length ; itemIndex++ ){
			     // stationaryItems[0]
			      if(stationaryItems[itemIndex].equals(existingItemName) ){
					    stationaryItems[itemIndex]  =  updatedItemName ; 
						  isUpdated = true ; 
				  }
			   
		   }
	  return isUpdated ; 
}





public static  int deleteStationaryItemName(String deletedItemName ){
	   System.out.println("Invoking editStationaryItemName");
		   System.out.println("No Of Parameters : 2 , type of parameter : String , String");
		   boolean isDeleted = false ;
        int itemIndex ; 
   int  noOfElements = stationaryItems.length ;
       for( itemIndex = 0 ;  itemIndex < stationaryItems.length ; itemIndex++ ){
		      if(stationaryItems[itemIndex].equals(deletedItemName) ){   
					   break;
				  }   
		   }	      
		  
		  if( itemIndex < noOfElements){
		     noOfElements = noOfElements-1; 
  for(int newItemIndex =  itemIndex ; newItemIndex <  noOfElements  ; newItemIndex++){            stationaryItems[newItemIndex] =   stationaryItems[newItemIndex+1];
				 }
		   }
				
	  return noOfElements ; 
}


   public static void getAllStationaryItemsPostDeletion(int newLength){
	      for(int itemIndex = 0 ;  itemIndex < newLength ; itemIndex++ ){
			  System.out.println(stationaryItems[itemIndex]);
		  }
   }

   // returns specific item name (String)
   public static String searchStationaryItemByName(String itemName){
	   System.out.println("Invoking getStationaryItemByName");
	    System.out.println("No of parameter : 1 ,  type String");
      String sName = null ;	 
	 for( String name  : stationaryItems){
		   
		     // "Ink Pen".equals("Ink Pen")
		   if(name.equals(itemName)){
			       sName  =    name ; 
				   System.out.println("Item name found");
			      
		   }
	}
	   return sName ; 
   }
   
    

							  
}
