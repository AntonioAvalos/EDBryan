/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entornosconcursonumeros;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan
 */
public class ConcursoNumerosTest {
    
    public ConcursoNumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of jugador method, of class ConcursoNumeros.
     * La función Jugador comprueba si los jugadores están entre 1 y 6.
     * Realizaremos 3 pruebas con los valores 0, 3 y 7.
     */
    @Test
    public void testJugador() {
        
        // Primera prueba. Hay 0 jugadores.
        System.out.println("0 Jugadores");
        int a = 0;
        boolean expResult = false;
        boolean result = ConcursoNumeros.jugador(a);
        assertEquals(expResult, result);
    
        // Segundo prueba. Hay 3 jugadores.
        System.out.println("3 Jugadores");
        a = 3;
        expResult = true;
        result = ConcursoNumeros.jugador(a);
        assertEquals(expResult, result);
    
        // Tercera prueba. Hay 7 jugadores.
        System.out.println("7 Jugadores");
        a = 7;
        expResult = false;
        result = ConcursoNumeros.jugador(a);
        assertEquals(expResult, result); }

    /**
     * Test of ronda method, of class ConcursoNumeros.
     * La función Ronda comprueba que las rondas son 3, 5, 10 o 20.
     * Realizaremos 11 pruebas con los valores 2, 3, 4, 5, 6, 9, 10, 11, 19,
     * 20, 21.
     */
    @Test
    public void testRonda() {
        
        // Primera prueba. Hay 2 rondas.
        System.out.println("2 Rondas");
        int a = 2;
        boolean expResult = false;
        boolean result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Segunda prueba. Hay 3 rondas.
        System.out.println("3 Rondas");
        a = 3;
        expResult = true;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Tercera prueba. Hay 4 rondas.
        System.out.println("4 Rondas");
        a = 4;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Cuarta prueba. Hay 5 rondas.
        System.out.println("5 Rondas");
        a = 5;
        expResult = true;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Quinta prueba. Hay 6 rondas.
        System.out.println("6 Rondas");
        a = 6;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Sexta prueba. Hay 9 rondas.
        System.out.println("9 Rondas");
        a = 9;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Séptima prueba. Hay 10 rondas.
        System.out.println("10 Rondas");
        a = 10;
        expResult = true;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Octava prueba. Hay 11 rondas.
        System.out.println("11 Rondas");
        a = 11;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Novena prueba. Hay 19 rondas.
        System.out.println("19 Rondas");
        a = 19;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Décima prueba. Hay 20 rondas.
        System.out.println("20 Rondas");
        a = 20;
        expResult = true;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result);
    
        // Undécima prueba. Hay 21 rondas.
        System.out.println("21 Rondas");
        a = 21;
        expResult = false;
        result = ConcursoNumeros.ronda(a);
        assertEquals(expResult, result); } } 

    /**
     * Test of arrayNombreJug method, of class ConcursoNumeros.
     * La función arrayNombreJug devuelve un array con los nicks de los jugadores
     * que será de un tamaño igual al de jugadores introducidos (entre 1 y 6).
     * No se realizarán pruebas debido a que depende de múltiples entradas que 
     * introduzca el usuario.
     */

    /*
    @Test
    public void testArrayNombreJug() {
        System.out.println("arrayNombreJug ");
        int n = 0;
        String[] expResult = null;
        String[] result = ConcursoNumeros.arrayNombreJug(n);
        assertArrayEquals(expResult, result); }
    */

    /**
     * Test of introducirNombreJug method, of class ConcursoNumeros.
     * La función introducirNombreJug no devuelve nada por lo tanto no se
     * realizará pruebas sobre ella.
     */
    
    /*
    @Test
    public void testIntroducirNombreJug() {
        System.out.println("introducirNombreJug");
        int k = 0;
        int n = 0;
        String[] nombreJug = null;
        ConcursoNumeros.introducirNombreJug(k, n, nombreJug); }
    */    

    /**
     * Test of matrizTabla method, of class ConcursoNumeros.
     * La función matrizTabla devuelve una matriz con las rondas y las puntuaciones
     * en cada ronda de cada jugador que será del tamaño igual al de jugadores
     * (entre 1 y 6) y rondas (3, 5, 10 o 20) introducidas. No se realizarán pruebas
     * debido a que depende de múltiples entradas que introduzca el usuario. 
     */
    
    /*
    @Test
    public void testMatrizTabla() {
        System.out.println("matrizTabla");
        int r = 0;
        int n = 0;
        int[][] expResult = null;
        int[][] result = ConcursoNumeros.matrizTabla(r, n);
        assertArrayEquals(expResult, result); }  
    */

    /**
     * Test of numeros method, of class ConcursoNumeros.
     * La función numeros utiliza un Math.random para generar números aleatorios
     * entre el 2 y el 12. Debido a esta aleatoriedad no se realizarán pruebas
     * sobre esta función.
     */
        
    /*
    @Test
    public void testNumeros() {
        System.out.println("numeros");
        int a = 0;
        int expResult = 0;
        int result = ConcursoNumeros.numeros(a);
        assertEquals(expResult, result); }
    */

    /**
     * Test of operadores method, of class ConcursoNumeros.
     * La función Operadores utiliza un Math.random para generar casos aleatorios
     * con operadores entre suma, resta o producto. Debido a esta aleatoriedad
     * no se realizarán pruebas sobre esta función.
     */
        
    /*
    @Test
    public void testOperadores() {
        System.out.println("operadores");
        int a = 0;
        String expResult = "";
        String result = ConcursoNumeros.operadores(a);
        assertEquals(expResult, result); }
    */
    
    /**
     * Test of pregunta method, of class ConcursoNumeros.
     * La función pregunta utiliza un Math.random para generar casos aleatorios
     * con estructuras de enteros entre 4 y 8. Debido a esta aleatoriedad no se
     * realizarán pruebas sobre esta función.
     */
        
    /*
    @Test
    public void testPregunta() {
        System.out.println("pregunta");
        int x = 0;
        int y = 0;
        String expResult = "";
        String result = ConcursoNumeros.pregunta(x, y);
        assertEquals(expResult, result); }
    */
    
    /**
     * Test of calcularResultado method, of class ConcursoNumeros.
     * La estructura de función CalcularResultado convierte un String de Java a
     * JavaScript para poder operarlo y calcular la respuesta a la pregunta 
     * matemática. Sólo calcula el resultado correctamente en la versión 8.2 de
     * NetBeans en las demás devuelve 0 siempre. Esta función fue aportada por la
     * profesora de programación y dado al escaso entendimiento que tenemos sobre
     * su funcionamiento no haremos pruebas sobre esta función.
     */
        
    /*
    @Test
    public void testCalcularResultado() {
        System.out.println("calcularResultado");
        String expresion = "";
        int expResult = 0;
        int result = ConcursoNumeros.calcularResultado(expresion);
        assertEquals(expResult, result); }
    */
    
    /**
     * Test of juego method, of class ConcursoNumeros.
     * La función juego no devuelve nada por lo tanto no se realizarán pruebas 
     * sobre ella.
     */
        
    /*
    @Test
    public void testJuego() {
        System.out.println("juego");
        int i = 0;
        int[][] tabla = null;
        int j = 0;
        String[] nombreJug = null;
        int x = 0;
        int y = 0;
        Scanner entrada = null;
        int contJ1 = 0;
        int contJ2 = 0;
        int contJ3 = 0;
        int contJ4 = 0;
        int contJ5 = 0;
        int contJ6 = 0;
        int n = 0;
        ConcursoNumeros.juego(i, tabla, j, nombreJug, x, y, entrada, contJ1, contJ2, contJ3, contJ4, contJ5, contJ6, n); }
    */
    
    /**
     * Test of puntosRonda method, of class ConcursoNumeros.
     * La función puntosRonda no devuelve nada por lo tanto no se realizarán 
     * pruebas sobre ella.
     */
    
    /*
    @Test
    public void testPuntosRonda() {
        System.out.println("puntosRonda");
        int n = 0;
        int j = 0;
        int[][] tabla = null;
        String[] nombreJug = null;
        int contJ1 = 0;
        int contJ2 = 0;
        int contJ3 = 0;
        int contJ4 = 0;
        int contJ5 = 0;
        int contJ6 = 0;
        ConcursoNumeros.puntosRonda(n, j, tabla, nombreJug, contJ1, contJ2, contJ3, contJ4, contJ5, contJ6); }
    */

    /**
     * Test of ganadorJuego method, of class ConcursoNumeros.
     * La función ganadorJuego no devuelve nada por lo tanto no se realizarán 
     * pruebas sobre ella.
     */
    
    /*
    @Test
    public void testGanadorJuego() {
        System.out.println("ganadorJuego");
        int contJ1 = 0;
        int contJ2 = 0;
        int contJ3 = 0;
        int contJ4 = 0;
        int contJ5 = 0;
        int contJ6 = 0;
        String[] nombreJug = null;
        ConcursoNumeros.ganadorJuego(contJ1, contJ2, contJ3, contJ4, contJ5, contJ6, nombreJug); }
    */
 
    /**
     * Test of main method, of class ConcursoNumeros.
     * La función main no devuelve nada por lo tanto no se realizarán pruebas 
     * sobre ella.
     */
        
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConcursoNumeros.main(args); } 
    */