/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Entidad;

/**
 *
 * @author Pablo
 */
public class Cuenta {
    
    private int nroCuenta;
    private long DNI;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long DNI, int saldo) {
        this.nroCuenta = nroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nroCuenta=" + nroCuenta + ", DNI=" + DNI + ", saldo=" + saldo + '}';
    }
    
    
    
}
