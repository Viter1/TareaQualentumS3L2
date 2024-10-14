package com.example.Ejercicio_sprint3.carregistry.controller;

import com.example.Ejercicio_sprint3.carregistry.model.ModelCarregistry;
import com.example.Ejercicio_sprint3.carregistry.repository.RepositoryCarregistry;
import com.example.Ejercicio_sprint3.carregistry.service.ServiceCarregistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class ControllerCarregistry {

    private static final Logger logger = LoggerFactory.getLogger(ControllerCarregistry.class);
    private final ServiceCarregistry serviceCarregistry;



    public ControllerCarregistry(ServiceCarregistry serviceCarregistry) {
        this.serviceCarregistry = serviceCarregistry;
    }

    @GetMapping()
    public String getCars(){
        logger.info("Accediendo a la aplicación de registro de vehículos");

        serviceCarregistry.logVehiculo();
        return "Información del vehículo registrada en el log";



    }




}
