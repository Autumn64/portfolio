//Made by Mónica Nayely Flores Gómez (Autumn64)
package cuentas;

public class Cuentas {
    public static void main(String[] args) {
        Cuenta cuentaActual;
        CuentaCorriente corriente = new CuentaCorriente("Usuario 1", 12345, 1.7);
        Persona corriente1 = new Persona("Usuario 1", 12345);
        CuentaAhorro ahorro = new CuentaAhorro("Usuario 2", 67890, 2.5);
        Persona ahorro1 = new Persona("Usuario 2", 67890);
        
        cuentaActual = corriente;
        corriente.convertirAString();
        System.out.println("Nombre: " + corriente1.getNombre());
        System.out.println("NIF: " + corriente1.getNif());
        ahorro.convertirAString();
        System.out.println("Nombre: " + ahorro1.getNombre());
        System.out.println("NIF: " + ahorro1.getNif());
        
        cuentaActual.setSaldo(5000);
        System.out.println("El saldo actual es " + cuentaActual.getSaldo());
        System.out.println("Retirando 4500");
        cuentaActual.retirar(4500);
        System.out.println("El saldo actual es " + cuentaActual.getSaldo());
        
        cuentaActual = ahorro;
        cuentaActual.setSaldo(6000);
        System.out.println("---------------\nEl saldo actual es " + cuentaActual.getSaldo());
        System.out.println("Retirando 6001");
        cuentaActual.retirar(6001);
        System.out.println("El saldo actual es " + cuentaActual.getSaldo());
        
        ahorro.actualizarInteres(3.1);
        System.out.println("El interés es " + cuentaActual.getInteres());
    }
}