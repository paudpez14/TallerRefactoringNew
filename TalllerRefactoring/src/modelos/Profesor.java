package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public String nombre;
    public String apellido;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, InformacionAdicionalProfesor info) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.info=info;
        paralelos= new ArrayList<>();
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    
}
