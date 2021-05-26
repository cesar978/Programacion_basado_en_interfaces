package programacioninterfaces;

public class Creandotrabajador {
	public static void main(String[]args) {
		Herramineta herramienta = new Jeringa();
		
		Trabajador trabajador = new Trabajador();
		trabajador.setHerramienta(herramienta);
		
		System.out.println("El nombre de la herramienta del trabajador es "
		 +trabajador.getHerramienta().getNombre());

	}
}
