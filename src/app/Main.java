package app;

import service.GestorEmpleados;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN LLANQUIHUE TOUR ===");

        GestorEmpleados gestor = new GestorEmpleados();


        gestor.cargarDatosDesdeArchivo("empleados.txt");


        System.out.println("\n=== LISTADO COMPLETO DE COLABORADORES ===");
        gestor.mostrarTodosLosEmpleados();


        gestor.buscarPorCargo("Guia Gastronomico");
    }
}