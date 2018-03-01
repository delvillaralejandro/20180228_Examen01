
public class Banorte extends Bank{
	public Banorte() {
		this.mintrans = 5;
		this.format = "HTML";
		this.tranferee = "Person 1";
		this.intotrans = "Person 2";
	}
	
	public Banorte(int min) {
		this.mintrans = min;
		this.format = "HTML";
		this.tranferee = "Person 1";
		this.intotrans = "Person 2";
		
	}
		
	
	@Override
	public void Transfer() {
		if(this.amount < this.mintrans) {
			System.out.print("Tranfer amount is too small!");
			//System.exit(0);
		}
		else {
			System.out.println("Amount to be transferred: " + amount);
		}
		

	}

	@Override
	public String getTransferee() {
		return this.tranferee;
	}

	@Override
	public String getintoTrans() {
		return this.intotrans;
	}

	@Override
	public String getFormat() {
		return this.format;
	}
	
	public void setTransferee(String send) {
		this.tranferee = send;
	}
	
	public void setIntoTrans(String recieve) {
		this.intotrans = recieve;
	}
	
	public void setFormat(String formato) {
		this.format = formato;
	}
	
	

}
