package uygulama;

public class MükemmelSayi {

	public static void main(String[] args) {
		int sayi=6;
		   int i;
		   int toplam=0;
		   boolean mukemmel=false;
		   
		   for(i=1;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   
				   toplam=toplam+i;
				   
				   if(sayi==toplam) {
					   
					   mukemmel=true;
				   }
				   
			   }
			   
			 
			  }
		   
		   if(mukemmel==false) {
			   
			   System.out.println("sayý mükemmel deðil");
		   }
		   else {
			   System.out.println("sayý mükemmel ");
		   }

	}

}
