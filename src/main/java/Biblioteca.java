package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca, permitiendo la gestión de libros.
 *
 * @author Aarón Díaz Hernández
 * @version 1.0
 * @see <a href="https://github.com/Aarondh84">Github Profile</a>
 * @see GitHub RepositoryURL: <a href=https://github.com/Aarondh84/Examen_2doTrimestre.git"></a>
 */
public class Biblioteca {

    /**
     * Lista de libros almacenados en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto que inicializa una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que permite inicializar la biblioteca con una lista de libros.
     *
     * @param libros Lista inicial de libros a almacenar en la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro que se desea agregar.
     * @return {@code true} si el libro se agregó correctamente, {@code false} en caso contrario.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro que se desea eliminar.
     * @return {@code true} si el libro se eliminó correctamente, {@code false} si no se encontró en la lista.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros almacenados en la biblioteca.
     *
     * @return Lista de libros en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o {@code null} si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este método está obsoleto. Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     * para manejar múltiples resultados.
     *
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado con el autor indicado o {@code null} si no se encuentra.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor en la biblioteca.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista con todos los libros del autor indicado, o una lista vacía si no hay coincidencias.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
