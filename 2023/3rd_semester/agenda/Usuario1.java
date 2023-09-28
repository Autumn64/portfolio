//Made by Mónica Nayely Flores Gómez (Autumn64)
package agenda;
import javax.swing.JOptionPane;

public class Usuario1 {
    private String nombre, direccion, telefono;
    public Usuario1(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		direccion = JOptionPane.showInputDialog("Ingrese la direccion");
		telefono = JOptionPane.showInputDialog("Ingrese el telefono");
    }

    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
