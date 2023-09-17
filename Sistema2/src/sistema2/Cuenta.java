/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema2;

/**
 *
 * @author Jairo Tercero
 */
public class Cuenta extends Ttitular1 {

    private String tipo;
   

    public Cuenta(String tipohen) {
      
        this.tipo = tipo;
  
    }

    public Cuenta() {
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cuenta:" + "tipo: " + tipo ;
    }

   


}
