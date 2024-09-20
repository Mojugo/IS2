
package tarea1;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Creando libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321");

        // Agregando libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Creando usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "001");
        Usuario usuario2 = new Usuario("Ana Gómez", "002");

        // Agregando usuarios a la biblioteca
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Mostrando información
        System.out.println("Libros en la biblioteca:");
        biblioteca.mostrarLibros();
        
        System.out.println("\nUsuarios registrados:");
        biblioteca.mostrarUsuarios();
    }
}
