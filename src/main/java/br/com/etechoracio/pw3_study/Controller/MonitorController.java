package br.com.etechoracio.pw3_study.Controller;

import br.com.etechoracio.pw3_study.Service.MonitorService;
import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/monitores")
public class MonitorController {
    @Autowired
    private MonitorService service;

    @GetMapping
    private List<MonitorResponseDTO> listar(){

        return service.listar();
    }
    @GetMapping("/{id}")
    private List<MonitorResponseDTO> listarID(@PathVariable Long id){
        return service.ListarID(id);
    }
}
