import java.util.Arrays;
import java.util.Comparator;

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

    // ---- ORDENAR estudiantes por NOMBRE ----
    public void ordenarEstudiantesPorNombre() {
        Object[] arr = estudiantes.convertirAArray();
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                String n1 = ((Estudiante) o1).getNombre();
                String n2 = ((Estudiante) o2).getNombre();
                return n1.compareTo(n2);
            }
        });
        estudiantes = ListaEnlazada.convertirArrayALista(arr);
    }

    // ---- ORDENAR estudiantes por PROMEDIO (descendente) ----
    public void ordenarEstudiantesPorPromedioDesc() {
        Object[] arr = estudiantes.convertirAArray();
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                double p1 = ((Estudiante) o1).calcularPromedio();
                double p2 = ((Estudiante) o2).calcularPromedio();
                return Double.compare(p2, p1); // descendente
            }
        });
        estudiantes = ListaEnlazada.convertirArrayALista(arr);
    }

    // ---- BÚSQUEDA BINARIA por nombre (debe estar ordenado por nombre previamente) ----
    public Estudiante buscarEstudianteBinario(String nombreBuscado) {
        Object[] array = estudiantes.convertirAArray();
        // Se asume que el array está ordenado por nombre. Si no, ordenar antes.
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            Estudiante aux = (Estudiante) array[mid];
            int comp = aux.getNombre().compareTo(nombreBuscado);
            if (comp == 0) return aux;
            else if (comp < 0) inicio = mid + 1;
            else fin = mid - 1;
        }
        return null;
    }

    // ---- Método auxiliar para imprimir la lista de estudiantes ----
    public void imprimirEstudiantes() {
        Object[] arr = estudiantes.convertirAArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    // Getter para pruebas
    public ListaEnlazada getEstudiantes() {
        return estudiantes;
    }
}    while (inicio <= fin) {
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
