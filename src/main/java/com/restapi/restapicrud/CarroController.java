package com.restapi.restapicrud;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@AllArgsConstructor
public class CarroController {
    
    CarroRepository repository;
    
    @GetMapping("/")
    public String index() {
        return "Bem vindo ao sistema de cadastro de carros para ter acesso ao swagger entre em: 'https://springboot-rest-api-cars.herokuapp.com/swagger-ui/index.html'";
    }
    
    @GetMapping("/carros")
    public List<Carro> getCarros(){
        CarrosPadroes.DefaultCars(repository);
        return repository.findAll();
    }


    @GetMapping("/carros/{id}")
    public Carro getCarroById(@PathVariable long id){
        return repository.findById(id).get();
    }

    @PostMapping("/carros")
        public Carro saveCarro(@RequestBody Carro carro){
            return repository.save(carro);
        }
    

    @DeleteMapping("/carros/{id}")
    public void deleteCarro(@PathVariable long id){
        repository.deleteById(id);
    }

    @PutMapping("/carros/{id}")
    public Carro updateCarro(@PathVariable long id, @RequestBody Carro carro){
        carro.setId(id);
        return repository.save(carro);
    }


}
