class SpeakerTester{


  public static void main(String test[]){
       System.out.println("Main started");
	   // click on button
	   Speaker.name = "";
      boolean connected =  Speaker.on();
System.out.println("Is Speaker connected"+ connected);
 Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
   boolean connected1 =  Speaker.off();
System.out.println("Is Speaker connected"+ connected1);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();  



Speaker.decreaseVolume();
boolean connected2 =  Speaker.onOrOff();
System.out.println("Is Speaker connected"+ connected2);
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
		
	   System.out.println("Main ended");
 
  }
  

	
	


}