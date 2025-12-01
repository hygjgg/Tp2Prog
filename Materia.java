public class Materia {
    private String nombre;
    private double nota; // nota numérica

    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
}
