package taller2.ejercicio3;

public class Fiesta {

    public void determinarPermiso(Persona persona){
        if(persona.getEdad() >= 18 ){
            System.out.println(persona.getNombre() +" "+ persona.getPrimerApellido() +" "+ persona.getSegundoApellido() +
                    " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else {
            System.out.println(persona.getNombre() +" "+ persona.getPrimerApellido() +" "+ persona.getSegundoApellido() +
                    " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }

}
