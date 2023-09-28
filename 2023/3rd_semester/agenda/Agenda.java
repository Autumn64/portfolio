//Made by Mónica Nayely Flores Gómez (Autumn64)
package agenda;
import javax.swing.JOptionPane;

public class Agenda{
    public static void main(String []args){
        Usuario1 usuario1 = new Usuario1();
        Usuario2 usuario2 = new Usuario2();
        JOptionPane.showMessageDialog(null, "Agenda\n"
				+ "\nNombre: " + usuario1.getNombre()
				+ "\nDirección: " + usuario1.getDireccion()
				+ "\nTeléfono: " + usuario1.getTelefono()
				+ "\n\nNombre: " + usuario2.getNombre()
				+ "\nDirección: " + usuario2.getDireccion()
				+ "\nTeléfono: " + usuario2.getTelefono());
	}
}
