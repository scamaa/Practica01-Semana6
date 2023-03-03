/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica_v3.Practica01.controller;

import com.practica_v3.Practica01.domain.Estado;
import com.practica_v3.Practica01.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;
  
    @GetMapping("/")
    public String inicio(Model model) {
        var estados=estadoService.getEstados();
        model.addAttribute("estados", estados);
        
        return "index";
    }
    
    @GetMapping("/estado/eliminar/{idEstado}")
    public String eliminaCliente(Estado estado){
        estadoService.deleteEstado(estado);
        return "redirect:/";
    }
    
    @GetMapping("/estado/nuevo")
    public String nuevoEstado(Estado estado){
        return "modificaEstado";
    }
    
    @PostMapping("estado/guardar")
    public String guardarEstado(Estado estado){
        estadoService.saveEstado(estado);
        return "redirect:/";
    }
    
    @GetMapping("/estado/modificar/{idEstado}")
    public String modificaEstado(Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificaEstado";
    }
    
}
