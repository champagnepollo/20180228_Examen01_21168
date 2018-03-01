public abstract class Bank{
	
	public abstract void receive(List datos);
	public abstract void transfer(Bank b, List datos);
	public abstract void setFormat(String f);
	public abstract void setProtocol(Protocol p);
}