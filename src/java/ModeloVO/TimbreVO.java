/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Damian
 */
public class TimbreVO {
    
    private String idTimbre, piso, fase, habitacion;

    public TimbreVO() {
    }

    public TimbreVO(String idTimbre, String piso, String fase, String habitacion) {
        this.idTimbre = idTimbre;
        this.piso = piso;
        this.fase = fase;
        this.habitacion = habitacion;
    }

    public String getIdTimbre() {
        return idTimbre;
    }

    public void setIdTimbre(String idTimbre) {
        this.idTimbre = idTimbre;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
}
