import java.util.ArrayList;

public class ListaEnlazada {

    private Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            return;
        }
        Nodo actual = primero;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public int tamaño() {
        int t = 0;
        Nodo actual = primero;
        while (actual != null) {
            t++;
            actual = actual.siguiente;
        }
        return t;
    }

    // Convierte lista → array
    public Object[] convertirAArray() {
        int tamaño = tamaño();
        Object[] array = new Object[tamaño];
        Nodo actual = primero;
        int i = 0;
        while (actual != null) {
            array[i++] = actual.dato;
            actual = actual.siguiente;
        }
        return array;
    }

    // Convierte array → lista (mantiene orden del array)
    public static ListaEnlazada convertirArrayALista(Object[] array) {
        ListaEnlazada nueva = new ListaEnlazada();
        for (Object o : array) {
            nueva.agregar(o);
        }
        return nueva;
    }

    // Buscar por predicado simple (devuelve primer match)
    public Object buscarPorNombre(String nombre) {
        Nodo actual = primero;
        while (actual != null) {
            Object d = actual.dato;
            // soporte para Estudiante/Profesor/Materia que tengan getNombre()
            try {
                String n = (String) d.getClass().getMethod("getNombre").invoke(d);
                if (n.equals(nombre)) return d;
            } catch (Exception e) {
                // ignorar
            }
            actual = actual.siguiente;
        }
        return null;
    }
}        actual = primero;
        int indice = 0;

        while (actual != null) {
            array[indice++] = actual.dato;
            actual = actual.siguiente;
        }

        return array;
    }

    // Convierte array → lista
    public static ListaEnlazada convertirArrayALista(Object[] array) {
        ListaEnlazada nueva = new ListaEnlazada();
        for (Object o : array) {
            nueva.agregar(o);
        }
        return nueva;
    }
}
