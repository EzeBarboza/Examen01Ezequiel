/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exame01_Ezequiel.Examen.Service;

import Exame01_Ezequiel.Examen.Entity.Pelicula;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ezeco
 */
public class PeliculaServiceTest {
    
    public PeliculaServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAllPeliculas method, of class PeliculaService.
     */
    @Test
    public void testGetAllPeliculas() {
        System.out.println("getAllPeliculas");
        PeliculaService instance = new PeliculaService();
        List<Object> expResult = null;
        List<Object> result = instance.getAllPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeliculaById method, of class PeliculaService.
     */
    @Test
    public void testGetPeliculaById() {
        System.out.println("getPeliculaById");
        long id = 0L;
        PeliculaService instance = new PeliculaService();
        Object expResult = null;
        Object result = instance.getPeliculaById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePelicula method, of class PeliculaService.
     */
    @Test
    public void testSavePelicula() {
        System.out.println("savePelicula");
        Pelicula pelicula = null;
        PeliculaService instance = new PeliculaService();
        instance.savePelicula(pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PeliculaService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        long id = 0L;
        PeliculaService instance = new PeliculaService();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
