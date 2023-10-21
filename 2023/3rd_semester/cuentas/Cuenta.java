//Made by Mónica Nayely Flores Gómez (Autumn64)
package cuentas;

public abstract class Cuenta {
    private long numerocuenta;
    private double saldo;
    protected double interes;
    private String cliente;
    
    public Cuenta(String c, long n, double i){
        this.numerocuenta = n;
        this.cliente = c;
        this.interes = i;
    }
    
    public void setSaldo(double nuevosaldo){
        saldo = nuevosaldo;
    }
    
    public long getNumeroCuenta(){
        return this.numerocuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getCliente(){
        return this.cliente;
    }
    
    public double getInteres(){
        return this.interes;
    }
    
    abstract void retirar(double monto);
    
    abstract void actualizarSaldo(double monto);
    
}