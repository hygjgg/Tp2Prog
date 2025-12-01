public class Main {
    public static void main(String[] args) {
        Universidad u = new Universidad();

        Estudiante e1 = new Estudiante("Ana");
        e1.agregarMateria(new Materia("Matematica", 8));
        e1.agregarMateria(new Materia("Historia", 6));

        Estudiante e2 = new Estudiante("Bruno");
        e2.agregarMateria(new Materia("Matematica", 9));
        e2.agregarMateria(new Materia("Historia", 7));

        Estudiante e3 = new Estudiante("Carlos");
        e3.agregarMateria(new Materia("Matematica", 5));
        e3.agregarMateria(new Materia("Historia", 4));

        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);
        u.agregarEstudiante(e3);

        System.out.println("Antes de ordenar:");
        u.imprimirEstudiantes();

        u.ordenarEstudiantesPorNombre();
        System.out.println("\nOrdenados por nombre:");
        u.imprimirEstudiantes();

        u.ordenarEstudiantesPorPromedioDesc();
        System.out.println("\nOrdenados por promedio (desc):");
        u.imprimirEstudiantes();

        u.ordenarEstudiantesPorNombre(); // ordenar antes de binaria
        Estudiante buscado = u.buscarEstudianteBinario("Bruno");
        System.out.println("\nBusqueda binaria (Bruno): " + (buscado != null ? buscado : "No encontrado"));
    }
}
