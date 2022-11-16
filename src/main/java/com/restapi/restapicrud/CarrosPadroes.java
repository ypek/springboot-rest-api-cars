package com.restapi.restapicrud;

import org.springframework.web.bind.annotation.RequestBody;

public class CarrosPadroes extends CarroController {
    public CarrosPadroes(CarroRepository repository) {
        super(repository);
    }

    public static void DefaultCars(@RequestBody CarroRepository repository){
        Carro carro1 = new Carro((long) 1, "Fiat", "Uno", "2010", "https://i.imgur.com/ugQt25R.png");
        Carro carro2 = new Carro((long) 2, "Fiat", "Palio", "2015", "https://i.imgur.com/ugQt25R.png");
        Carro carro3 = new Carro((long) 3, "Fiat", "Strada", "2018", "https://i.imgur.com/ugQt25R.png");
    
        repository.save(carro1);
        repository.save(carro2);
        repository.save(carro3);
    }
}
