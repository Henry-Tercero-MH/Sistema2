/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema2;

/**
 *
 * @author Jairo Tercero
 */
public class Ttitular1 {
    private int no=10000990;
    private String nombres;
    private String apellidos;
    private String cui;

    public  void Ttitular1( String nombres, String apellidos, String cui) {
        no++;
        this.no = no;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cui = cui;
    }

    public Ttitular1() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    @Override
    public String toString() {
        return "Titular\n" + "No de Cuenta: " + no + " Nombres: " + nombres + " Apellidos: " + apellidos + " Cui: " + cui ;
    }


    
    
    
    
    
    
    
}
