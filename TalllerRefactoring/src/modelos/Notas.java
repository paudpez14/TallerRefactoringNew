/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author paudp
 */
public class Notas {
    private Estudiante estudiante;
    private Paralelo p;
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;

    public Notas(Estudiante estudiante, Paralelo p, double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.estudiante = estudiante;
        this.p = p;
        this.nexamen = nexamen;
        this.ndeberes = ndeberes;
        this.nlecciones = nlecciones;
        this.ntalleres = ntalleres;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Paralelo getP() {
        return p;
    }

    public void setP(Paralelo p) {
        this.p = p;
    }

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }
    
}
