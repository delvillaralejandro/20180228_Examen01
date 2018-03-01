
public class Main {
	public static void main(String args[]) {
		Bank bancomer = new Bancomer(50);
		bancomer = new FireWire(bancomer);
		
		Bank banorte = new Banorte(50);
		bancomer = new MoneyGram(bancomer);
		
		Bank hsbc = new HSBC(555);
		bancomer = new FTTP(hsbc);
		
		System.out.println("Transfermatron v1.0");
		System.out.println("//=//=//=//=//=//=//=//=//");
		
		bancomer.Transfer();
		System.out.println(" ");
		System.out.println("Transferee: " + bancomer.getTransferee());
		System.out.println("Transfered into: " + bancomer.getintoTrans());
		System.out.println("Format: " + bancomer.getFormat());
		
		System.out.println("Hsbc");
		hsbc.Transfer();
		System.out.println(" ");
		System.out.println("Transferee: " + hsbc.getTransferee());
		System.out.println("Transfered into: " + hsbc.getintoTrans());
		System.out.println("Format: " + hsbc.getFormat());
		
		System.out.println("Bancomer");
		banorte.Transfer();
		System.out.println(" ");
		System.out.println("Transferee: " + banorte.getTransferee());
		System.out.println("Transfered into: " + banorte.getintoTrans());
		System.out.println("Format: " + banorte.getFormat());
	}
}
