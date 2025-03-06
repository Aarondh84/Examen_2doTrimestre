package test.java;

import static org.junit.jupiter.api.Assertions.*;

import main.java.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para la clase Libro.
 */
class TestLibro { // Se mantiene el nombre "Test" según lo solicitado

    private Libro libro;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        libro = new Libro("El Padrino", "Mario Puzo", 1969);
    }

    /**
     * Prueba para verificar que el constructor inicializa correctamente los valores.
     */
    @Test
    void testConstructor() {
        assertEquals("El Padrino", libro.getTitulo(), "El título no es correcto");
        assertEquals("Mario Puzo", libro.getAutor(), "El autor no es correcto");
        assertEquals(1969, libro.getAnioPublicacion(), "El año de publicación no es el correcto");
    }

    /**
     * Prueba para el método setTitulo().
     */
    @Test
    void testSetTitulo() {
        libro.setTitulo("El Padrino");
        assertEquals("El Padrino", libro.getTitulo(), "Título no actualizado");
    }

    /**
     * Prueba para el método setAutor().
     */
    @Test
    void testSetAutor() {
        libro.setAutor("Fulano");
        assertEquals("Fulano", libro.getAutor(), "El autor no se ha actualizado correctamente");
    }

    /**
     * Prueba para el método setAnioPublicacion().
     */
    @Test
    void testSetAnioPublicacion() {
        libro.setAnioPublicacion(2024);
        assertEquals(2024, libro.getAnioPublicacion(), "El año de publicación no se ha actualizado");
    }
}