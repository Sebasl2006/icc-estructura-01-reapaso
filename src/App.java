
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)

        };
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();


        vC.printMessage("Arreglo Personas");

        vC.printPersonsArray(personas);

        vC.printMessage("Arreglo Ordenado");
        
        pC.ordenarPorEdad(personas);

        vC.printPersonsArray(personas);

        vC.printMessage("Buscamos la persona con edad 32");
        Persona personaBuscada = pC.buscarPorEdad(personas, 32);
        if (personaBuscada == null){
            vC.printMessage("No se encontro la Persona");
        }else{
            vC.printMessage("Se encontro la persona con la edad 32");
            vC.printMessage(personaBuscada.toString());
        }






        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
