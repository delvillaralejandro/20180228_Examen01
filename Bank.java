
public abstract class Bank {
	int mintrans;
	int amount;
	String tranferee;
	String intotrans;
	String format;
	
	public abstract void Transfer();
	public abstract String getTransferee();
	public abstract String getintoTrans();
	public abstract String getFormat();
}
