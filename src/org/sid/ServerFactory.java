package org.sid;

// Etape 4 : Création des classes d'usine PCFactory et ServerFactory qui implementent l'interface ComputerAbstractFactory.
public class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
