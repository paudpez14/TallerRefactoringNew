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
    
    private void  CalcularNotaInicial(Notas note){  
        for(Paralelo par:paralelos){
            if(note.getP().equals(par)){
                double notaTeorico=(note.getNexamen()+note.getNdeberes()+note.getNlecciones())*0.80;
                double notaPractico=(note.getNtalleres())*0.20;
                note.getP().getMateria().setNotaInicial(notaTeorico+notaPractico);
            }
        }
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    private void  CalcularNotaFinal(Notas note){  
        for(Paralelo par:paralelos){
            if(note.getP().equals(par)){
                double notaTeorico=(note.getNexamen()+note.getNdeberes()+note.getNlecciones())*0.80;
                double notaPractico=(note.getNlecciones())*0.20;
                note.getP().getMateria().setNotaFinal(notaTeorico+notaPractico);
            }
        }
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    private void CalcularNotaTotal(Paralelo p){
        for(Paralelo par:paralelos){
            if(p.equals(par)){
              double  notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
              p.getMateria().setNotaTotal(notaTotal);
            }
        }
        
    }
}
