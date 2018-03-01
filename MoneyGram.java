
public class MoneyGram extends TransferPro{
	protected Bank bank;
	String protocol;
	public MoneyGram(Bank b) {
		this.bank = b;
		this.protocol = "MoneyGram";
		
		this.format = "MoneyGram";
		this.tranferee = "Person 1";
		this.intotrans = "Person 2";
		
	}
	
	/*public void dispProtocol() {
		System.out.println("Protocol Used: " + protocol);
	}*/

	@Override
	public String getFormat() {
		return bank.getFormat() + " " + "Protocol: " + this.format;
	}//this.format will be protocol name

	@Override
	public void Transfer() {
		if(bank.amount < bank.mintrans) {
			System.out.print("Tranfer amount is too small!");
			//System.exit(0);
		}
		else {
			System.out.println("Amount to be transferred: " + bank.amount);
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
	
		
}
