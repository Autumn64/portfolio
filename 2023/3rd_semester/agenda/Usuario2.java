//Made by Mónica Nayely Flores Gómez (Autumn64)
package agenda;
import javax.swing.JOptionPane;

public class Usuario2 {
    private String nombre, direccion, telefono;
    public Usuario2(){
        nombre = "Juanito Flores";
		direccion = "Prados Sur, Tultitlán";
		telefono = "12345678";
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
