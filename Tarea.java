public class Tarea {
    
    String identificadorTarea;
    String nombreTarea;
    String fechaDeInicio;
    String fechaDeFin;
    String responsable;
    String tiempo;
    String dinero;
    String esfuerzo;
    String gradoDeAvance;

    public Tarea(String identificadorTarea, String nombreTarea, String fechaDeInicio, String fechaDeFin, String responsable, String tiempo, String dinero, String esfuerzo, String gradoDeAvance){

        this.identificadorTarea = identificadorTarea; 
        this.nombreTarea = nombreTarea;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.responsable = responsable;
        this.tiempo = tiempo;
        this.dinero = dinero;
        this.esfuerzo = esfuerzo;
        this.gradoDeAvance = gradoDeAvance;
    }   

}
