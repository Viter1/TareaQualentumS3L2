package com.example.Ejercicio_sprint3.carregistry.service;

import com.example.Ejercicio_sprint3.carregistry.model.ModelCarregistry;
import com.example.Ejercicio_sprint3.carregistry.repository.RepositoryCarregistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceCarregistry {

    private static final Logger logger = LoggerFactory.getLogger(ServiceCarregistry.class);

    @Value("${custom.vehicle.default-make}")
    private String valor;





    public void logVehiculo(){
        logger.info("Default vehicle make from properties: {}", valor);
        ModelCarregistry vehicle = new ModelCarregistry();
        vehicle.setModelo("Civic");
        vehicle.setAnio(2022);
        vehicle.setPuertas(4);

        logger.info("Vehicle Information: {}", vehicle.toString());
    }
}
