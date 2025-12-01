public class Profesor {

    private String nombre;
    private ListaEnlazada materiasAsignadas;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materiasAsignadas = new ListaEnlazada();
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }
}
