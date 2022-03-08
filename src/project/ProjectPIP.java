package project;
import java.util.Random;

public class ProjectPIP {

	public static void main(String[] args) {
		System.out.println("For repository");
		int a,b,c;
		a=0;
		b=2;
		c=a+b;
		int[] sir=new int[6]; //secventa de cifre care va fi formata din cifrele 1,2,3 generate random
    	int[] arr={1,2,3};
    	for(int j=0;j<5;j++){
    
      	Random r=new Random();    
      	int randomNumber=r.nextInt(arr.length);
      	sir[j]=arr[randomNumber];
      	System.out.print(sir[j]);
    	}
    	
	
	}

}
