public class kupuvac {

	public int kupuvacID;
	private adresalok adresalinija;
	
	
	public kupuvac(int kupuvacID,adresalok adresalinija) {
		
		this.kupuvacID = kupuvacID;
		this.adresalinija = adresalinija;
		
	}

	
	
	public int getKupuvacID() {
		return kupuvacID;
	}

	public adresalok getAdresalinija() {
		return adresalinija;
	}


	
	
	
	
}
