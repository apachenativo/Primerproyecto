public class App {
    
    private String Nombre;
    private int Identificacion;
    private double Estatura;
    private float Peso;
    private char Sexo;
    private boolean Vacuna;

    public static void main2(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //operadores aritmeticos
        int resultado = 45 + 12;
        resultado = 45 - 12;
        resultado = 45 * 12;
        resultado = 45 / 12;
        resultado = 45 % 12;
        boolean respuesta = true;
        // operadores unarios
        resultado++;
        resultado--;
        //algebra booleana
        respuesta = 5 < 8;
        respuesta = 5 > 8;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 == 8;
        respuesta = 5 != 8;
        //operadores logicos
        respuesta = 5 < 8 && 4 >= 6;
        respuesta = 5< 8 || 4 >= 6;

        //estrcuturas, funciones de control (condicionales)
        if (5 != 10) {
            //bloque de codigo
        }

        if (respuesta) {
        
        } else if (respuesta){
            //bloque de codigo
        } else {
            //bloque de codigo            
        }

        int llave = 2;
        switch (llave) {
            case 1:
                //bloque de codigo
                break;

            case 2:
                //bloque de codigo
                break;
        
            default:
                break;
        }

        //ciclos, repeticiones

        while (llave > 5) {
            //bloque de codigo
        }

        do {
            
        } while (llave > 5);

        for (String string : args) {
            //bloque codigo
        }

        // for i = declaracion de variable; condicion; aumento

        for (int i = 0; i < args.length; i++) {
            
        }
    }
}
