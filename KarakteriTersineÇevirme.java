package uygulama;

public class KarakteriTersineÇevirme {

	public static void main(String[] args) {
		
		String ters="abcd";

	    String metin="";
	    int rev=ters.length()-1;

	    for(int i=0;i<ters.length();i++){

	      metin=metin + ters.charAt(rev-i);
	    }
	  

	    System.out.println(metin);
	    
	  }

	}


