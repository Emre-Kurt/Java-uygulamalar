package uygulama;

public class AsalSayi {

	public static void main(String[] args) {
		int sayi=11;
		   int i;
		   boolean asalM�=true;
		   
		   
		   if(sayi==1) {
			   
		   System.out.println("say� asal de�il ��nk� 1");
		   
		   return;
		   
		   }
		   
		   if(sayi<1) {
		   
			   System.out.println("1 den k���k bir say� girdiniz");
			   return;
		   }
		   
		  
		   for(i=2;i<sayi;i++) {
			   
			   if(sayi%i==0) {
				   asalM�=false;
				   
				   }
		   }
		   
		   if(asalM�==true) {
			   
		   System.out.println("say� asald�r");
		   
		   }
		   else {
		System.out.println("say� asal de�il");
		
		   
		   }

	}

}
