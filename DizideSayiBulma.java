package uygulama;

public class DizideSayiBulma {

	public static void main(String[] args) {
		int[] sayilar= new int[]{1,3,5,7,9,};
		  
		  int bulunacak=5;
		  
		 
		 boolean varM�=false;
		  
		  
		  for(int sayi : sayilar) {
			  
			  if(sayi==bulunacak) {
				  
				  varM�=true;
				  break;
			  }
		  }
		   
		   if(varM�) {
			   System.out.println("say� var");
		   }
		   else {
			   System.out.println("say� yok");
		   }

	}

}
