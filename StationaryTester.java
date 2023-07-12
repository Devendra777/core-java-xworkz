class StationaryTester{


  public static void main(String tester[]){
  
                    // Create , save , add
	                Stationary.addStationaryItems("Books");
                    Stationary.addStationaryItems("Pencil");
					Stationary.addStationaryItems("Pen");
					Stationary.addStationaryItems("Eraser");
					Stationary.addStationaryItems("SketchPens");
					Stationary.addStationaryItems("Ink Pen");
					Stationary.addStationaryItems("safety Pin");
					Stationary.addStationaryItems("Charts");
					
					// Read , get , fetch
					Stationary.getAllStationaryItems();
					
					
					
	String itemName = 	Stationary.searchStationaryItemByName("safety Pin");
	         System.out.println("The searched item name is "+ itemName);
					
  
                    // update  , edit
                    Stationary.editStationaryItemName( "CardBoard Sheets", "safety Pin");
					
					Stationary.getAllStationaryItems();
     int newLegth =   Stationary.deleteStationaryItemName("SketchPens");
	 System.out.println("Calling getAllStationaryItemsPostDeletion");
	      Stationary.getAllStationaryItemsPostDeletion(newLegth);
	 
	 
	   int newLegth1 =   Stationary.deleteStationaryItemName("Eraser");
	 System.out.println("Calling getAllStationaryItemsPostDeletion");
	      Stationary.getAllStationaryItemsPostDeletion(newLegth1);
	 
	 
  
  }





}