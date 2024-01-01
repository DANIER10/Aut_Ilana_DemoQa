package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class DataPrueba {

    String nombre;
    String apellido;
    String correo;
    String numero;
    String cumpleanos;
    String mensaje;

    public static List<DataPrueba> setData(DataTable dataTable) {
        List<DataPrueba> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DataPrueba.class));
        }
        return dates;
    }
}