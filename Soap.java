class Soap{

     // static variable
      static    String    type  =   "Body Wash" ;
	  static    int     price = 30 ; 
      static    String  mfgDate = "Jan-26";
	  static    String expDate = "Dec-21";
        // The type is Body Wash .

  public static void main(String  soap[]){
  
    // local
    String soapName = "Santoor";
     
     System.out.println("Main started");
        
		System.out.println("The Soap Name is  "+ soapName);
		System.out.println("The Soap Type is " + type);
		System.out.println("The Soap Manufacturing Date is "+ mfgDate);
		System.out.println("The Soap Expiry Date is "+ expDate);
  
   System.out.println("Main ended");
  }


}