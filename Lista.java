import java.util.*;
public class Lista{

    String identificadorLista;
    String nombreLista;
    String descripcionLista;

    public Lista(String identificadorLista, String nombreLista, String descripcionLista)
    {
        this.identificadorLista = identificadorLista;
        this.nombreLista = nombreLista;
        this.descripcionLista = descripcionLista;

        ArrayList<Tarea> listaPendiente = new ArrayList<Tarea>();
    }
  
}