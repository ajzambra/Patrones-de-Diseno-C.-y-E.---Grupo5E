
public class Tienda {
	//atributos
	
	public static void main(String[] args) {
		//se instancia el tipo de cliente deseado
		
		ClienteBasico CB = new ClienteBasico();
		ClientePremium CP = new ClientePremium();
		ClienteVIP CV = new ClienteVIP();
		
		//se genera la tarjeta dependiendo del cliente
		
		CB.getTipoTarjeta(); //tarjeta basica
		CP.getTipoTarjeta(); //tarjeta premium
		CV.getTipoTarjeta(); //tarjeta vip
	}
}
