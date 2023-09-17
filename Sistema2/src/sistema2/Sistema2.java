/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sistema2;

import java.util.Scanner;


 
 // @author Henry Tercero
 
public class Sistema2 {

    public static void main(String[] args) {
          Ttitular1 nuevo = new Ttitular1();
          Cuenta cuenta = new Cuenta();
             Scanner entrada = new Scanner(System.in);
        System.out.println("Nombres:");
        String nombre = entrada.nextLine();
        System.out.println("Apellidos:");
        String apellidos = entrada.nextLine();
        System.out.println("Digite su cui");
        String cui = entrada.nextLine();
        System.out.println("Tipo de cuenta\n1.Monetaria\n2.Ahorro");
         int tipo = entrada.nextInt();
         if (tipo==1) {
             String cuentas="monetaria";
             cuenta.setTipo(cuentas);
          nuevo.Ttitular1(nombre, apellidos, cui);
        }else if (tipo==2) {
            String cuentaAhorro="Ahorro";
            cuenta.setTipo(cuentaAhorro);
        nuevo.Ttitular1(nombre, apellidos, cui);
        }
           Scanner leer = new Scanner(System.in);
      boolean salir = false;
    Banco banco = new Banco();
          int opcion;
        do {   
            
                  System.out.println(".:BIENVENIDO:.");
                  System.out.println("Menu:");
                  System.out.println("1. Retirar");
                  System.out.println("2. Deposito");
                  System.out.println("3. Estado de Cuenta");
                  System.out.println("4. Salir");
                  opcion = leer.nextInt();
                           
                  switch (opcion) {
                case 1:
                    //retirar datos banco
                    
                    System.out.println("Ingrese la cantidad a retirar");
                    double retiro = leer.nextDouble();
                banco.retiro(retiro);
                 
                    break;
                       case 2:
                           System.out.println("Digite la cantidad a depositar");
                           double dep = leer.nextDouble();
                 banco.deposito(dep);
                          break;
                         
                       case 3:
                           System.out.println( cuenta.toString());
                           System.out.println(nuevo.toString());
                           System.out.println("SALDO DE LA CUENTA: "+ banco.getSaldo());
                       
                           
                      break;    
                        case 4:
                             System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    leer.close();
                           salir = true;
                      break;  
                default:
                    System.out.println("Invalida");
         
                  }
        } while (opcion != 4);
             
        
    }

}
