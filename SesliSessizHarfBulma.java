package uygulama;

public class SesliSessizHarfBulma {

	public static void main(String[] args) {
		 String harf="o";
		   String kucultme=harf.toLowerCase();
		   
		   switch(kucultme) {
		   
		   case "a":
		   case "�":
		   case "o":
		   case "u":
			   System.out.println("kal�n sesli harf girdiniz");
			   break;
			   
		   case "e":
		   case "i":
		   case "�":
		   case "�":
		       
			   System.out.println("ince sesli harf girdiniz");
			   break;
			   
			   default:
				   System.out.println("sessiz harf girdiniz");
			   
		  
		   }
			   
		   

	}

}
