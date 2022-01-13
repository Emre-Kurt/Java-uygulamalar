package uygulama;

public class DizideSayiBulma {

	public static void main(String[] args) {
		int[] sayilar= new int[]{1,3,5,7,9,};
		  
		  int bulunacak=5;
		  
		 
		 boolean varMý=false;
		  
		  
		  for(int sayi : sayilar) {
			  
			  if(sayi==bulunacak) {
				  
				  varMý=true;
				  break;
			  }
		  }
		   
		   if(varMý) {
			   System.out.println("sayý var");
		   }
		   else {
			   System.out.println("sayý yok");
		   }

	}

}
