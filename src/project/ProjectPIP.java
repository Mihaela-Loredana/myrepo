package project;
import java.util.Random;

public class ProjectPIP {

     public static void metodaCuExceptii() throws Exception{
		System.out.println("For repository");
		int[] sir=new int[6]; //secventa de cifre care va fi formata din cifrele 1,2,3 generate random
    	int[] arr={1,2,3};
    	for(int j=0;j<5;j++){
    
      	Random r=new Random();    
      	int randomNumber=r.nextInt(arr.length);
      	sir[j]=arr[randomNumber];
      	System.out.print(sir[j]);
    	}
    	
		for(int i=0;i<5;i++){
      	 
				if(sir[i]==1){ //Mod1: Pentru valoarea 1 din sir se arunca exceptiile in ordinea E1,E2,E3
      	 try{ 
      		final Exception exe = new Exception();
	      	exe.addSuppressed(new E1());
	        exe.addSuppressed(new E2());
	        exe.addSuppressed(new E3());
        	throw exe; 
     
      	 }
      	 catch (Throwable e) {
             Throwable[] suppExe = e.getSuppressed();
             for (int j = 0; j < suppExe.length; j++) {
                 System.out.println(suppExe[j]);
             }
      	 }
				}
      	else if(sir[i]==2){ //Mod 2: Pentru valoarea 2 se arunca exceptiile in ordinea E2,E1,E3
      		try{ 
          		final Exception exe = new Exception();
          		exe.addSuppressed(new E2());
    	      	exe.addSuppressed(new E1());
    	        exe.addSuppressed(new E3());
            	throw exe; 
         
          	 }
          	 catch (Throwable e) {
                 Throwable[] suppExe = e.getSuppressed();
                 for (int j = 0; j < suppExe.length; j++) {
                     System.out.println(suppExe[j]);
                 }
      	}
      	}
      		else if(sir[i]==3){//Mod 3: Pentru valoarea 3 se arunca exceptiile in ordinea E3,E1,E2
      			try{ 
      	      		final Exception exe = new Exception();
      	      	    exe.addSuppressed(new E3());
      		      	exe.addSuppressed(new E1());
      		        exe.addSuppressed(new E2());
      		        throw exe; 
      	     
      	      	 }
      	      	 catch (Throwable e) {
      	             Throwable[] suppExe = e.getSuppressed();
      	             for (int j = 0; j < suppExe.length; j++) {
      	                 System.out.println(suppExe[j]);
      	             }}
      		}
      		  
			}
    }
    	
public static void main(String[] args) {
	try{
		  ProjectPIP.metodaCuExceptii();
		}
      catch(Exception exe){
      	System.out.println("\nExceptie: "+exe.getMessage());
     
          }
	}
}
