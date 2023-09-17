/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema2;

/**
 *
 * @author Jairo Tercero
 */
public class Banco  {
    private double saldo;

    public Banco() {
    }

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retiro(double cantidad){
    if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso. Su saldo actual es: Q." + this.saldo);
        } else if (cantidad > this.saldo) {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        } else {
            System.out.println("Cantidad de retiro no válida. Ingrese un valor positivo.");
        }
    
      
    }
    
    public void deposito(double deposito){
             if (deposito > 0) {
            this.saldo += deposito;
            System.out.println("Depósito exitoso. Su saldo actual es: Q." + this.saldo);
        } else {
            System.out.println("Cantidad de depósito no válida. Ingrese un valor positivo.");
        }
    }

    @Override
    public String toString() {
        return "Banco\n" + "Saldo: Q." + saldo;
    }
        
    
  


    
    
}
