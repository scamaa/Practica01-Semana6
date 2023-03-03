package com.practica_v3.Practica01.service.impl;

import com.practica_v3.Practica01.dao.EstadoDao;
import com.practica_v3.Practica01.domain.Estado;
import com.practica_v3.Practica01.services.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {
    
    //Esto crea una unica copia de un objeto
    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    public List<Estado> getEstados(){
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    public void deleteEstado(Estado estado) {
        estadoDao.delete(estado);
    }

    @Override
    public void saveEstado(Estado estado) {
        estadoDao.save(estado);
    }
    
}
