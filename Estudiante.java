public class Estudiante {

    private String nombre;
    private ListaEnlazada materias;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materias = new ListaEnlazada();
    }

    public String getNombre() {
        return nombre;
    }

    public ListaEnlazada getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }

    // Método recursivo que inicia desde el primer nodo
    public double calcularPromedio() {
        return calcularPromedioRecursivo(materias.getPrimero(), 0, 0.0);
    }

    public static double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0.0 : suma / contador;
        }
        Materia mat = (Materia) actual.dato;
        return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + mat.getNota());
    }

    @Override
    public String toString() {
        return nombre + " - Promedio: " + String.format("%.2f", calcularPromedio());
    }
}
