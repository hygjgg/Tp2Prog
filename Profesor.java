public class Profesor {

    private String nombre;
    private ListaEnlazada materiasAsignadas;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materiasAsignadas = new ListaEnlazada();
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }

    public ListaEnlazada getMateriasAsignadas() {
        return materiasAsignadas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
