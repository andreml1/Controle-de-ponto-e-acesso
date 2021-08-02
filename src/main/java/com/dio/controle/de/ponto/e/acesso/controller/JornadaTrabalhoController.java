package com.dio.controle.de.ponto.e.acesso.controller;

import com.dio.controle.de.ponto.e.acesso.model.JornadaTrabalho;
import com.dio.controle.de.ponto.e.acesso.repository.JornadaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaRepository jornadaRepository;

    @PostMapping
    @ApiOperation(value = "Salva dados tab. jornada")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    @GetMapping
    @ApiOperation(value = "Retorna uma lista tab. jornada")
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna um dado tab. jornada")
    public Optional<JornadaTrabalho> getById(@PathVariable(value = "id") long id){
        return jornadaRepository.findById(id);
    }

    @PutMapping
    @ApiOperation(value = "Atualiza dados tab. jornada")
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }


    @DeleteMapping
    @ApiOperation(value = "Deleta dados tab. jornada")
    public void deletaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        jornadaRepository.delete(jornadaTrabalho);
    }


}
