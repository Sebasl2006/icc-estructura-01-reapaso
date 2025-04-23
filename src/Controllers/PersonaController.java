package Controllers;

import Models.Persona;
import views.ViewConsole;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for(int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = actual;


        }

        
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int lower = 0;
        int high = personas.length -1;
        while (high >= lower) {
            int central = (high + lower) / 2;
            if ( personas[central].getEdad() == edad) return personas[central];
            if (personas[central].getEdad() > edad) high = central -1;
            else lower = central + 1;
                
            
            
        }
        return null;
        

    }
}
