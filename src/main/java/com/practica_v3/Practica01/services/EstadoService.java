/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica_v3.Practica01.services;
import com.practica_v3.Practica01.domain.Estado;
import java.util.List;

/**
 *
 * @author Santiago
 */
public interface EstadoService {
    
    //Obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos cliente
    public List<Estado> getEstados();
    
    //Obtiene el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cleinte
    public Estado getEstado(Estado estado);
    
    //Elimina el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    public void deleteEstado(Estado estado);
    
    //Si el idCliente pasado no existe o es nulo se crea
    //un registro nuevo en la tabla cliente
    //si el idCliente existe... se actualiza la informacion
    public void saveEstado(Estado estado);
}
