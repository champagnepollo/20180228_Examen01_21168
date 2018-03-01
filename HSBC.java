public class HSBC extends Bank{
	List<String> datos;
	Protocol protocol;
	String format;

	public void HSBC(){
		datos = new ArrayList<String>();
		protocol = new A();
		format = "HTML";
	}
	public void receive(List datos){
		System.out.println("Banco HSBC recibe: " + datos.get(0) + " pesos, de la cuenta: " + datos.get(1));
	}
	public void transfer(Bank b, ) {
		Transfer.parse(b, )
	}
	public void setFormat(String f){
		this.format = format;
	}
	public void setProtocol(Protocol p){
		this.protocol = protocol;
	}
}