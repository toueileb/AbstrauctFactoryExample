package org.sid;

/* Etape 5 : Création de la classe ComputerFactory qui possède une méthode abstraite getComputer() prenant
 en paramètre une ComputerAbstractFactory. */

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
