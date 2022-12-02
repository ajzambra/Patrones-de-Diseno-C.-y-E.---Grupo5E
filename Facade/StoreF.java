package facade;

public class StoreF {
	private StoreV web;
	private StoreV movil;
	private StoreV telefono;
	
	public StoreF() {
		web = new Web();
		movil = new Movil();
		telefono = new Telefono();
	}
	
	public void comprarWeb() {
		web.comprar();
	}
	
	public void comprarMovil() {
		movil.comprar();
	}
	
	public void comprarTelefono() {
		telefono.comprar();
	}
}
