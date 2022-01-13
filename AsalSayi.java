package uygulama;

public class AsalSayi {

	public static void main(String[] args) {
		int sayi=11;
		   int i;
		   boolean asalMý=true;
		   
		   
		   if(sayi==1) {
			   
		   System.out.println("sayý asal deðil çünkü 1");
		   
		   return;
		   
		   }
		   
		   if(sayi<1) {
		   
			   System.out.println("1 den küçük bir sayý girdiniz");
			   return;
		   }
		   
		  
		   for(i=2;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   asalMý=false;
				   
				   }
		   }
		   
		   if(asalMý==true) {
			   
		   System.out.println("sayý asaldýr");
		   
		   }
		   else {
		System.out.println("sayý asal deðil");
		
		   
		   }

	}

}
