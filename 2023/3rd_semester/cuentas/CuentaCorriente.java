//Made by Mónica Nayely Flores Gómez (Autumn64)
package cuentas;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(String c, long n, double i){
        super(c, n, i);
    }
    
    void retirar(double monto){
        if (monto > this.getSaldo()){
            System.out.println("El monto a retirar es mayor que el saldo disponible");
            return;
        }
        actualizarSaldo(monto);
    }
    
    void actualizarSaldo(double monto){
        setSaldo(this.getSaldo() - monto);
        System.out.println("Saldo actualizado exitosamente.");
    }
    
    public void convertirAString(){
        System.out.println("Nombre: " + getCliente() + ", No. Cuenta: " + getNumeroCuenta() +
                ", Saldo: " + getSaldo() + ", Interés: " + getInteres());
    }
}
