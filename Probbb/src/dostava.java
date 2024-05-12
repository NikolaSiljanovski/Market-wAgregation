public class dostava { 


	public static void main(String[] args) {

		String lokacija = new String("Debar Maalo,Franklin Roosvelt br:5");
		adresalok adresa1 = new adresalok(15,lokacija);
		kupuvac tom = new kupuvac(1212, adresa1);
		
		System.out.println("Kupuvac id: " + tom.getKupuvacID());
		System.out.println("Stan br : " + tom.getAdresalinija().getStanbr());
		System.out.println("Lokacija : " + tom.getAdresalinija().getLokacija());
		
		
		
	System.out.println("*************************************************************************");
		
		adresalok adresa2 = new adresalok(32,lokacija);
		kupuvac marko = new kupuvac(333,adresa2);
		System.out.println("Kupuvac ID : " + marko.getKupuvacID());
		System.out.println("Stan br : " + marko.getAdresalinija().getStanbr());
		System.out.println("Lokacija : " + marko.getAdresalinija().getLokacija());
		
	
		
		
	}
	

}
