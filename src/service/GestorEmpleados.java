package service;

import model.Direccion;
import model.Empleado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public GestorEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void cargarDatosDesdeArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length == 7) {
                    String rut = datos[0].trim();
                    String nombre = datos[1].trim();
                    String correo = datos[2].trim();
                    String calle = datos[3].trim();
                    int numero = Integer.parseInt(datos[4].trim());
                    String comuna = datos[5].trim();
                    String cargo = datos[6].trim();

                    Direccion dir = new Direccion(calle, numero, comuna);
                    Empleado emp = new Empleado(rut, nombre, correo, dir, cargo);

                    listaEmpleados.add(emp);
                }
            }
            System.out.println("Datos cargados exitosamente desde " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato numérico del archivo: " + e.getMessage());
        }
    }

    public void mostrarTodosLosEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay registros en el sistema.");
            return;
        }
        for (Empleado emp : listaEmpleados) {
            System.out.println("----------------------------------------");
            System.out.println(emp); // Llama automáticamente al toString() de Empleado
        }
    }

    public void buscarPorCargo(String cargoBuscar) {
        System.out.println("\n🔎 Resultados para colaboradores con cargo: [" + cargoBuscar + "]");
        boolean encontrado = false;
        for (Empleado emp : listaEmpleados) {
            if (emp.getCargo().equalsIgnoreCase(cargoBuscar)) {
                System.out.println(emp);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron colaboradores en ese cargo.");
        }
    }
}