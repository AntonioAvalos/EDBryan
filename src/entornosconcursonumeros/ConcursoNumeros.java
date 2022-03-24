package entornosconcursonumeros;

/** 
 * Desarrollar un programa en Java que permita jugar a un juego de preguntas y respuestas
 * inspirado en el conocido concurso de televisión Saber y ganar
 *   
 * El programa deberá permitir jugar a una versión simplificada de un concurso de preguntas y
 * respuestas en el que varios jugadores responden preguntas por turnos, acumulan puntos y
 * al final gana el que más puntos tiene Toda la interacción con los usuarios será mediante
 * entrada y salida estándar (teclado y pantalla).
 */

/**
 *
 * @author Bryan.
 */
    
// Este programa utiliza la clase Scanner de Java del paquete java.util.
import java.util.Scanner;

// Este programa utiliza la clase ScriptEngineManager del paquete javax.script.
import javax.script.ScriptEngineManager;

// Este programa utiliza la clase ScriptEngine del paquete javax.script.
import javax.script.ScriptEngine;
    
public class ConcursoNumeros {
        
    /** 
     * La función jugador comprueba si el número de jugadoras está entre 
     * 1 y 6. 
     * @param a
     * @return 
     */
    public static boolean jugador (int a) {
            
        return a >= 1 && a <= 6; }

    /** 
     * La función ronda comprueba si el número de rondas está entre
     *  3,5,10 o 20.
     *  @param a
     *  @return
     */
    public static boolean ronda (int a) {
            
        return a == 3 || a == 5 || a == 10 || a == 20; }
    
    /**
     * La función arrayNombreJug será la que albergue el array de Strings con
     * los nombres de los jugadores.
     * @param n
     * @return 
     */
    public static String[] arrayNombreJug(int n) {
        
        String nombreJug[]= new String[n];
        return nombreJug; }
    
    /**
     * La función introducirNombreJug será con la que introduciremos los nombres
     * en el array nombreJug.
     * @param k
     * @param n
     * @param nombreJug 
     */
    public static void introducirNombreJug(int k, int n, String[] nombreJug) {
        
        for(k = 0; k < n; k++){

            Scanner entradanombreJug = new Scanner(System.in);
            System.out.println("Introduzca su nick para ser un jugador(sin espacios):");
            nombreJug[k]= entradanombreJug.nextLine(); } }
        
    /**
     * La función matrizTabla será la que albergue la matriz con las respuestas
     * de los jugadores cada ronda.
     * @param r
     * @param n
     * @return 
     */
    public static int[][] matrizTabla(int r, int n) {
        
        int tabla[][] = new int[r][n];
        return tabla;}
            
    /**
     * La función numeros selecciona aleatoriamente un número entre 2 y 12.
     * @param a
     * @return 
     */
    public static int numeros (int a) {
            
        a = (int) (2 + Math.random()* 11);
        return a; }
        
    /**
     * La función operadores selecciona aleatoriamente un operador entre 
     * suma, resta o multiplicación.
     * @param a
     * @return 
     */
    public static String operadores (int a) {
            
        a = (int)(1 + Math.random()* 3);
        String op = "";
        switch(a) {
            case 1: op = "+";
                break;
                
            case 2: op = "-";
                break;
                
            case 3: op = "*";
                break;}
        
            return op; }
        
    /**
     * La funcion pregunta selecciona aleatoriamente una pregunta entre 4
     * y 8 numeros.
     * @param x
     * @param y
     * @return 
     */
    public static String pregunta(int x, int y) {
            
        int a = (int) (1 + Math.random()* 5);
        String prgnt = "";
        switch(a) {
            case 1: prgnt = (numeros(x)+" "+operadores(y)+
                    " "+ numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x) );
                    break;
                    
            case 2: prgnt = (numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x));
                    break;
                    
            case 3: prgnt = (numeros(x)+" "+operadores(y)+" "+ numeros(x)+
                    " "+operadores(y)+" "+ numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x));
                    break;
                    
            case 4: prgnt = (numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x));
                    break;
                    
            case 5: prgnt = (numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+ numeros(x)+
                    " "+operadores(y)+" "+numeros(x)+" "+operadores(y)+" "+numeros(x));
                    break; }
            
            return prgnt; }
    
    /**
     * La función calcularResultado calcula la respuesta de la pregunta aleatoria.
     * Esta función solo funciona en la versión 8.2 de Netbeans en las versiones
     * más actuales devuelve 0 siempre.
     * @param expresion
     * @return 
     */
     public static int calcularResultado (String expresion) {
            
        int valor = 0;
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            Object result = engine.eval(expresion);
            valor = Integer.decode(result.toString()); }
        catch (Exception e) { e.getMessage(); }
        return valor; }
     
    /**
     * La funcion juego alberga la estructura principal del juego junto a otras
     * funciones anteriores en su interior para su correcto funcionamiento.
     * @param i
     * @param tabla
     * @param j
     * @param nombreJug
     * @param x
     * @param y
     * @param entrada
     * @param contJ1
     * @param contJ2
     * @param contJ3
     * @param contJ4
     * @param contJ5
     * @param contJ6
     * @param n 
     */
    public static void juego(int i, int[][] tabla, int j, String[] nombreJug, int x, int y, Scanner entrada, int contJ1, int contJ2, int contJ3, int contJ4, int contJ5, int contJ6, int n) {
        
        // La variable z es la pregunta aleatoria.
        String z;

        for(i = 0; i < tabla.length; i++){
            for(j = 0; j < tabla[0].length; j++){

            // Muestra en que ronda estamos y a qué jugador le toca responder.
            System.out.println("Ronda[" + (i + 1) + "] "+ nombreJug[j] +":");

            // La variable z contiene la función pregunta que genera la pregunta aleatoria.
            z = pregunta(x,y);

            // Muestra la pregunta aleatoria
            System.out.println(z);

            /* La variable respuesta utiliza la función calcularResultado para calcular
             * la respuesta a la pregunta.
             */
            int respuesta = calcularResultado (z);
            
            // Comprobación resultado de la pregunta matemática aleatoria.
            // System.out.println("Comprobación resultado: "+ respuesta);

            // Se introduce la respuesta a cada pregunta.
            tabla[i][j]= entrada.nextInt();

            /* Si la respuesta introducida es la misma a la generada por la variable respuesta
             * se suma un punto al respectivo jugador y se muestra un mensaje de que has
             * has acertado sino se muestra uno de que has fallado con la respuesta correcta.
             */
            if (tabla[i][j] == respuesta && j == 0){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ1++; }
                    
            if (tabla[i][j] == respuesta && j == 1){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ2++; }

            if (tabla[i][j] == respuesta && j == 2){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ3++; }

            if (tabla[i][j] == respuesta && j == 3){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ4++; }

            if (tabla[i][j] == respuesta && j == 4){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ5++; }

            if (tabla[i][j] == respuesta && j == 5){
                System.out.println("Has acertado.");
                System.out.println(""); // Salida estética.
                contJ6++; } 
               
            else if (tabla[i][j] != respuesta){
                System.out.println("Has fallado.");
                System.out.println("La respuesta correcta es: "+ respuesta);
                System.out.println(""); } } // Salida estética.
            
            // Usamos la función puntosRonda.
            puntosRonda(n, j, tabla, nombreJug, contJ1, contJ2, contJ3, contJ4, contJ5, contJ6); }
            
            // Usamos la función ganadorJuego.
            ganadorJuego(contJ1, contJ2, contJ3, contJ4, contJ5, contJ6, nombreJug); }
        
    /**
     * La función puntosRonda calcula los puntos de todos los jugadores al
     * final de cada ronda dependiendo del número de jugadores introducidos.
     * @param n
     * @param j
     * @param tabla
     * @param nombreJug
     * @param contJ1
     * @param contJ2
     * @param contJ3
     * @param contJ4
     * @param contJ5
     * @param contJ6 
     */
    public static void puntosRonda(int n, int j, int[][] tabla, String[] nombreJug, int contJ1, int contJ2, int contJ3, int contJ4, int contJ5, int contJ6) {
            
        if (n == 1){
            for (j = 0; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println(""); } } // Salida estética.
        
        if (n == 2){
            for (j = 1; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println("Los puntos de "+ nombreJug[1] +" son: "+ contJ2);
                System.out.println(""); } } // Salida estética.

        if (n == 3){
            for (j = 2; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println("Los puntos de "+ nombreJug[1] +" son: "+ contJ2);
                System.out.println("Los puntos de "+ nombreJug[2] +" son: "+ contJ3);
                System.out.println(""); } } // Salida estética.

        if (n == 4){
            for (j = 3; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println("Los puntos de "+ nombreJug[1] +" son: "+ contJ2);
                System.out.println("Los puntos de "+ nombreJug[2] +" son: "+ contJ3);
                System.out.println("Los puntos de "+ nombreJug[3] +" son: "+ contJ4);
                System.out.println(""); } } // Salida estética.

        if (n == 5){
            for (j = 4; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println("Los puntos de "+ nombreJug[1] +" son: "+ contJ2);
                System.out.println("Los puntos de "+ nombreJug[2] +" son: "+ contJ3);
                System.out.println("Los puntos de "+ nombreJug[3] +" son: "+ contJ4);
                System.out.println("Los puntos de "+ nombreJug[4] +" son: "+ contJ5);
                System.out.println(""); } } // Salida estética.

        if (n == 6){
            for (j = 5; j < tabla[0].length ;j++) {
                System.out.println("Los puntos de "+ nombreJug[0] +" son: "+ contJ1);
                System.out.println("Los puntos de "+ nombreJug[1] +" son: "+ contJ2);
                System.out.println("Los puntos de "+ nombreJug[2] +" son: "+ contJ3);
                System.out.println("Los puntos de "+ nombreJug[3] +" son: "+ contJ4);
                System.out.println("Los puntos de "+ nombreJug[4] +" son: "+ contJ5);
                System.out.println("Los puntos de "+ nombreJug[5] +" son: "+ contJ6);
                System.out.println(""); } } } // Salida estética.
        
    /**
     * La función ganador calcula el ganador al final del juego, comprueba los contadores
     * de todos los jugadores para ver cual es el mayor y decidir el ganador, si hay empate
     * no hay ganador.
     * @param contJ1
     * @param contJ2
     * @param contJ3
     * @param contJ4
     * @param contJ5
     * @param contJ6
     * @param nombreJug 
     */
    public static void ganadorJuego(int contJ1, int contJ2, int contJ3, int contJ4, int contJ5, int contJ6, String[] nombreJug) {
            
        if (contJ1 > contJ2 && contJ1 > contJ3 && contJ1 > contJ4  && contJ1 > contJ5  && contJ1 > contJ6) {
            System.out.println("El ganador es "+ nombreJug[0] +"."); }

        if (contJ2 > contJ1 && contJ2 > contJ3 && contJ2 > contJ4  && contJ2 > contJ5  && contJ2 > contJ6) {
            System.out.println("El ganador es "+ nombreJug[1] +"."); }

        if (contJ3 > contJ1 && contJ3 > contJ2 && contJ3 > contJ4  && contJ3 > contJ5  && contJ3 > contJ6) {
            System.out.println("El ganador es "+ nombreJug[2] +"."); }

        if (contJ4 > contJ1 && contJ4 > contJ2 && contJ4 > contJ3  && contJ4 > contJ5  && contJ4 > contJ6) {
            System.out.println("El ganador es "+ nombreJug[3] +"."); }

        if (contJ5 > contJ1 && contJ5 > contJ2 && contJ5 > contJ3  && contJ5 > contJ4  && contJ5 > contJ6) {
            System.out.println("El ganador es "+ nombreJug[4] +"."); }

        if (contJ6 > contJ1 && contJ6 > contJ2 && contJ6 > contJ3  && contJ6 > contJ4  && contJ6 > contJ5) {
            System.out.println("El ganador es "+ nombreJug[5] +"."); } }
           
    /**
     * 
     * @param args 
     */
    public static void main (String[] args) {
            
        // Crea un objeto de la clase Scanner para leer por teclado.
        Scanner entrada = new Scanner(System.in);
            
        // La variable n es el número de jugadores y r el número de rondas.
        int n, r;
            
        // Escribir un mensaje al usuario.
        System.out.println("Introduce el número de jugadores(1-6):");
            
        // Introducimos N.
        n = entrada.nextInt();
        System.out.println(""); // Salida estética.
            
        // Si N está entre 1-6 pedimos el número de rondas.
        if (jugador(n)) {
               
        // Escribir un mensaje al usuario.
        System.out.println("Introduce el número de rondas:\n"
        + "3(partida rápida).\n5(partida corta).\n10(partida normal).\n"
        + "20(partida larga)."); 
  
        // Introducimos R.
        r = entrada.nextInt();
        System.out.println(""); // Salida estética.
            
        // Si R está entre las rondas admitidas pedimos los nombres de los jugadores.
        if (ronda(r)) {
                
        // Creamos el array nombreJug medianta la función arrayNombreJug.
        String nombreJug[]= arrayNombreJug(n);
            
        // La variable k son las posiciones del array nombreJug.
        int k = 0;
        
        /* Utilizamos la función introducirNombreJug para introducir los nombres
         * de los jugadores.
         */
        introducirNombreJug(k, n, nombreJug);
        System.out.println(""); // Salida estética.
                
        // Creamos la matriz tabla mediante la función matrizTabla.
        int tabla[][] = matrizTabla(r, n);
            
        // La variable i son las filas y la variable j las columnas de la matriz.
        // La variable x es el número aleatorio entre 2 y 12.
        // La variable y son las operaciones aleatorias +,- y *.
        int i = 0;
        int j = 0;
        int x = 0;
        int y = 0;
            
        /* Contadores con la puntuación de cada jugador. Su puntos se iran acumulando
         * aquí tras cada ronda. Al principio de la partida todos empiezan con 0 puntos.
         */
        int contJ1 = 0;
        int contJ2 = 0;
        int contJ3 = 0;
        int contJ4 = 0;
        int contJ5 = 0;
        int contJ6 = 0;
        
        // La función juego contiene toda la estructura principal para jugar al juego.
        juego(i, tabla, j, nombreJug, x, y, entrada, contJ1, contJ2, contJ3, contJ4, contJ5, contJ6, n); }
                    
        // Si R distinto a 3, 5, 10 o 20 mostramos que hay un error.
        else {
            System.out.println("Error. Introduce correctamente el número de rondas."); } }
            
        // Si N distinto a 1-6 mostramos que hay un error.
        else {
            System.out.println("Error. Introduce correctamente el número de jugadores."); } } }
        
    
