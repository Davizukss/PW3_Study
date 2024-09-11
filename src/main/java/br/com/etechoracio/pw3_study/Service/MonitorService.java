package br.com.etechoracio.pw3_study.Service;

import br.com.etechoracio.pw3_study.Repository.MonitorRepository;
import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;
    private ModelMapper modelMapper = new ModelMapper();
    public List<MonitorResponseDTO> listar (){
        var monitores = repository.findAll();
        var resultado = monitores.stream().map(
                e-> modelMapper.map(e,MonitorResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }
    @Autowired
    public List<MonitorResponseDTO> ListarID(@PathVariable Long id){
        var monitores = repository.findById(id);
        var resultado = monitores.stream().map(
                e-> modelMapper.map(e,MonitorResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }

}
