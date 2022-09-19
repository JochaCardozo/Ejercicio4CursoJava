package sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado Jose = new Empleado("Jose",30, 83500, true);
        Empleado Valeria = new Empleado("Valeria",47, 120000, true);
        Empleado Carlos = new Empleado("Carlos",45, 83500, true);
        System.out.println(Jose);

        // CREATE - guardar empleados
        empleadoCRUD.save(Jose);
        empleadoCRUD.save(Valeria);
        empleadoCRUD.save(Carlos);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);


    }
}
