class Project1{  
  
   static void validate(int age)throws Project1s{  
     if(age<58)  
      throw new Project1("not valid");  
     else  
      System.out.println("welcome");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}  