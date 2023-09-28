//Made by Mónica Nayely Flores Gómez (Autumn64)
package empleado;
import javax.swing.JOptionPane;

public class Empleado{
	private String nombre, edad, sexo, direccion, telefono, DUI, email, cargo;
	private double sueldoneto, sueldoliquido;

	public Empleado(){
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		edad = JOptionPane.showInputDialog("Ingrese la edad del empleado");
		sexo = JOptionPane.showInputDialog("Ingrese el sexo del empleado");
		direccion = JOptionPane.showInputDialog("Ingrese la dirección del empleado");
		telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado");
		DUI = JOptionPane.showInputDialog("Ingrese el DUI del empleado");
		email = JOptionPane.showInputDialog("Ingrese el email del empleado");
		cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado");
		sueldoneto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo neto del empleado"));
		sueldoliquido = sueldoneto - (sueldoneto * (0.0625) + sueldoneto * (0.03) + sueldoneto * (0.07));
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getEdad(){
		return edad;
	}

	public void setEdad(String edad){
		this.edad = edad;
	}
	
	public String getSexo(){
		return sexo;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String getTelefono(){
		return telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getDUI(){
		return DUI;
	}

	public void setDUI(String DUI){
		this.DUI = DUI;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public String getCargo(){
		return cargo;
	}

	public void setCargo(String cargo){
		this.cargo = cargo;
	}

	public double getSueldoNeto(){
		return sueldoneto;
	}

	public void setSueldoNeto(double sueldoneto){
		this.sueldoneto = sueldoneto;
	}

	public double getSueldoLiquido(){
		return sueldoliquido;
	}

	public void setSueldoLiquido(double sueldoliquido){
		this.sueldoliquido = sueldoliquido;
	}
}
