package definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.example.DataPrueba;
import steps.RegistroEstudianteStep;

import java.util.List;

public class RegistroEstudianteDefinition {

    @Steps
    private RegistroEstudianteStep registroestudiantestep;


    @Dado("que el usuario ingresa al formulario de registro de estudiantes")
    public void que_el_usuario_ingresa_al_formulario_de_registro_de_estudiantes() {
       registroestudiantestep.ingresar();
       registroestudiantestep.ingresoAlForm();
    }
    @Cuando("registra un estudiante")
    public void registra_un_estudiante(DataTable table) {

        registroestudiantestep.registro(DataPrueba.setData(table).get(0));

    }
    @Entonces("verifica que se registro el estudiante")
    public void verifica_que_se_registro_el_estudiante(List<String> datos) {

       registroestudiantestep.verificarRegistro(datos.get(1));

    }

    }