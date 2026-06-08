package model;

public class Empleado extends Persona{

    private String cargo;

    public Empleado(String rut, String nombre, String correo, Direccion direccion, String cargo) {
        super(rut, nombre, correo, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo;
    }
}
