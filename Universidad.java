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

    public Estudiante buscarEstudianteBinario(String nombreBuscado) {

    Object[] array = estudiantes.convertirAArray();

    // Ordenar array antes de buscar (ej: por nombre)
    Arrays.sort(array, (a, b) -> 
        ((Estudiante) a).getNombre().compareTo(((Estudiante) b).getNombre())
    );

    int inicio = 0;
    int fin = array.length - 1;

    while (inicio <= fin) {
        int mid = (inicio + fin) / 2;

        Estudiante aux = (Estudiante) array[mid];
        int comp = aux.getNombre().compareTo(nombreBuscado);

        if (comp == 0)
            return aux;
        else if (comp < 0)
            inicio = mid + 1;
        else
            fin = mid - 1;
    }
    return null;
    }

    public void ordenarEstudiantesPorNombre() {

    // Convertir lista → array
    Object[] arr = estudiantes.convertirAArray();

    // Ordenar por nombre
    Arrays.sort(arr, (a, b) ->
        ((Estudiante) a).getNombre().compareTo(((Estudiante) b).getNombre())
    );

    // Convertir array → lista
    estudiantes = ListaEnlazada.convertirArrayALista(arr);
    }
}
