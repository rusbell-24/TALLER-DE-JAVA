// Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.
// Si la persona es mayor o igual a 18 años, entonce se deberá imprimir en pantalla [Nombre completo] usted es
// mayor de edad, por lo tanto puede entrar a la fiesta. Si la edad de la persona es menor que 18 años, entonces,
// deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, por lo tanto,
// no puede entrar a la fiesta, por favor devuélvase a su casa.

package taller2.ejercicio3;

public class Main {
    public static void main(String[] args){

        Persona persona = new Persona();
        Fiesta fiesta1 = new Fiesta();
        persona.leerDatos();
        fiesta1.determinarPermiso(persona);

    }
}
