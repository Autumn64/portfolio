//Made by Mónica Nayely Flores Gómez (Autumn64)
package empleado;
import javax.swing.JOptionPane;

public class Persona{
	public static void main(String []args){
		Empleado datos = new Empleado();
		JOptionPane.showMessageDialog(null, "Ficha del Empleado\n"
				+ "\nNombre: " + datos.getNombre()
				+ "\nEdad: " + datos.getEdad()
				+ "\nSexo: " + datos.getSexo()
				+ "\nDirección: " + datos.getDireccion()
				+ "\nTeléfono: " + datos.getTelefono()
				+ "\nNo. de DUI: " + datos.getDUI()
				+ "\nE-mail: " + datos.getEmail()
				+ "\nCargo que desempeña: " + datos.getCargo()
				+ "\nSueldo neto: " + datos.getSueldoNeto()
				+ "\nSueldo líquido: " + datos.getSueldoLiquido());
	}
}
