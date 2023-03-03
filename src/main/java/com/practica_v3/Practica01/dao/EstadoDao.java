package com.practica_v3.Practica01.dao;

import com.practica_v3.Practica01.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDao extends JpaRepository<Estado,Long>  {
    
}
