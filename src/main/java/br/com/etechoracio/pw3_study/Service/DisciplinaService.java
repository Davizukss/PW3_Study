package br.com.etechoracio.pw3_study.Service;

import br.com.etechoracio.pw3_study.Entity.Disciplina;
import br.com.etechoracio.pw3_study.Repository.DisciplinaRepository;
import br.com.etechoracio.pw3_study.dto.DisciplinaResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;
    private ModelMapper modelMapper = new ModelMapper();
    public List<DisciplinaResponseDTO> listar (){
        var disciplinas = repository.findAll();
        var resultado = disciplinas.stream().map(
                e-> modelMapper.map(e,DisciplinaResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }
}