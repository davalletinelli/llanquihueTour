import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN LLANQUIHUE TOUR ===");
        System.out.println("------------------------------------------");

        Direccion dir1 = new Direccion("San Martín", 450, "Llanquihue");
        Direccion dir2 = new Direccion("Vicente Pérez Rosales", 1025, "Puerto Varas");
        Direccion dir3 = new Direccion("Los Alerces", 89, "Llanquihue");

        Persona cliente = new Persona("20.123.456-7", "Carlos Mendoza", "carlos.m@gmail.com", dir1);
        Empleado guia = new Empleado("18.987.654-3", "Anaís Toledo", "anais.toledo@llanquihuetour.cl", dir2, "Guía Turístico Gastronómico");
        Empleado administrador = new Empleado("15.333.444-k", "Roberto Gómez", "roberto.g@llanquihuetour.cl", dir3, "Administrador de Operaciones");

        System.out.println("Datos del Cliente:");
        System.out.println(cliente);
        System.out.println();

        System.out.println("Datos del Guía (Empleado):");
        System.out.println(guia);
        System.out.println();

        System.out.println("Datos del Administrador (Empleado):");
        System.out.println(administrador);
        System.out.println("------------------------------------------");
    }
}