public class Universidad {

    private ListaEnlazada estudiantes;
    private ListaEnlazada profesores;
    private ListaEnlazada materias;

    public Universidad() {
        estudiantes = new ListaEnlazada();
        profesores = new ListaEnlazada();
        materias = new ListaEnlazada();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.agregar(e);
    }

    public void agregarProfesor(Profesor p) {
        profesores.agregar(p);
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }
}
