import java.util.ArrayList;

public class Programa{

    //Constantes en java EN MAYUSCULA
    final double VALOR_MATERIALES_ESPECIALES = 300000;
    final double VALOR_CLASES_INTENSIVAS = 200000;
    final double VALOR_TALLERES_FIN_DE_SEMANA = 150000;

    String nombre;
    double valorBase;
    int edadMinima;
    int edadMaxima; 
    ArrayList<Niño> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public double getValorBase() {
        return valorBase;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public ArrayList<Niño> getEstudiantes() {
        return estudiantes;
    }

    public Programa(String nombre, double valorBase, int edadMinima, int edadMaxima){
        this.nombre = nombre;
        this.valorBase = valorBase;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.estudiantes = new ArrayList<Niño>();
    }

    ArrayList<Niño> obtenerEstudiantes(){
        return this.estudiantes;
    }

}