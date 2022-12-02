package facade;

public class Facade {
	//atributos
	
	public static void main(String[] args) {
		//instanciar un objeto de la fachada
		
		StoreF fachada = new StoreF();
		
		//usar los metodos que se desean dependiendo de las necesidades
		
		fachada.comprarMovil();
		fachada.comprarTelefono();
		fachada.comprarWeb();
	}
}
