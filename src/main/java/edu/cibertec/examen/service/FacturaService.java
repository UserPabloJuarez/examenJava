/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.examen.service;

import edu.cibertec.examen.entity.FacturaEntity;
import edu.cibertec.examen.dao.repository.FacturaRepositorio;
import edu.cibertec.examen.entity.FacturaDetalleEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fredyarev25
 */

@Service
public class FacturaService {
    
    @Autowired
    private FacturaRepositorio facturaRepositorio;
    
    public List<FacturaEntity> getListaFacturas(){
        return facturaRepositorio.findAll();
    }
    
    @Transactional(propagation=Propagation.REQUIRED)
    public void insertarFactura(FacturaEntity factura){
        facturaRepositorio.save(factura);
    }
}
