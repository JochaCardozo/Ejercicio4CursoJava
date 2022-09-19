package sininterfaces;

import java.util.ArrayList;
import java.util.List;
/**
* Create
* Retrieve/Read
* Update
* Delete
 */

public class EmpleadoCRUD {

    // estructura de datos
    List<Empleado> empleados = new ArrayList<>();

    // operaciones CRUD

// CREATE - guardar un emplado
    public void save (Empleado empleado){

        empleados.add(empleado);
    }

    public List<Empleado> findAll(){

        return empleados;
    }

}
