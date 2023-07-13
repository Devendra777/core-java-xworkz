class Speaker{

      String name;
	    static  int  minVolume ; 
		static  int currentVolume ; 
		static  int maxVolume = 6 ; 
		static boolean isConnected ; 
		// method
	  public  static  boolean on(){
		 System.out.println("Invoking onOrOff()"); 
		  System.out.println("Parameter" + 0); 
          // 	false == false	 
		 if(isConnected == false){
			    isConnected = true ; 
				System.out.println("Speaker is Turned Onnn.. Enjoyyy");
				// true == true
		  }
	  }
	  public static boolean off(){
		   //  true == true
	  if(isConnected == true){
			  isConnected = false ; 
			  System.out.println("Speaker is Turned Off....");
			
		  }
	  }
	 
	return isConnected;  
	  }

	   // increaseVolume
	   public static void increaseVolume(){
		   System.out.println("Start of increaseVolume");
       if(isConnected  == true){
		  if(currentVolume < maxVolume){
			  
			  currentVolume =  currentVolume + 1 ; 
			  System.out.println("The Current Volume is"+ currentVolume);
		  }else{
			   System.out.println("Max Volume reached");
		    }
	}else{
			System.out.println("Gubee...Speaker Connect Maadu firstu");   
		 }
		  System.out.println("End of increaseVolume()");
	   }
	  public  void  boolean decreaseVolume(){
		  // logic
		  System.out.println("Invoking decreaseVolume()");
		  System.out.println("list of parameters "+ 0);
		  if(isConnected==true){
			  if(currentVolume > minVolume){
				  currentVolume=currentVolume-1;
				  System.out.println("The currentVolume is "+currentVolume);
			  }
			  }else{
				  System.out.println("Speaker is turned off...can't decrease Volume");
			  }
			  System.out.println("End of decreaseVolume()");
		  }
	  }
	  
	  



