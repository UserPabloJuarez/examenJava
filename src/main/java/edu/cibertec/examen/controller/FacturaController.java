/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.examen.controller;

import edu.cibertec.examen.entity.FacturaDetalleEntity;
import edu.cibertec.examen.entity.FacturaEntity;
import edu.cibertec.examen.service.FacturaService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fredyarev25
 */

@Controller
public class FacturaController {
    
    @Autowired
    private FacturaService facturaService;
    
    private List<FacturaDetalleEntity> listaFacturaDetalle;
    
    @RequestMapping("mostrarFactura")
    public ModelAndView mostrarFactura(){
        ModelAndView mv = new ModelAndView("listaFactura", "lista", facturaService.getListaFacturas());
        return mv;
    }
    
    @RequestMapping("insertarFactura")
    public ModelAndView insertarFactura(){
        ModelAndView mv = new ModelAndView("datosFactura");
        return mv;
    }
    
    @RequestMapping("grabarFactura")
    public ModelAndView grabarFactura(FacturaEntity facturaEntity, HttpServletRequest request){
        listaFacturaDetalle = new ArrayList<FacturaDetalleEntity>();
        FacturaDetalleEntity fd1 = new FacturaDetalleEntity();
        FacturaDetalleEntity fd2 = new FacturaDetalleEntity();
        FacturaDetalleEntity fd3 = new FacturaDetalleEntity();
        
        int cantidad1 =    Integer.parseInt(request.getParameter("cantidad1"));
        String producto1 = request.getParameter("producto1");
        double precio1 = Double.parseDouble(request.getParameter("precio1"));
        String parcial1 = request.getParameter("parcial1");
        fd1.setCantidad(cantidad1);
        fd1.setProducto(producto1);
        fd1.setPrecio(precio1);
        fd1.setParcial(parcial1);
        fd1.setFactura(facturaEntity);
        
        int cantidad2 =    Integer.parseInt(request.getParameter("cantidad2"));
        String producto2 = request.getParameter("producto2");
        double precio2 = Double.parseDouble(request.getParameter("precio2"));
        String parcial2 = request.getParameter("parcial2");
        fd2.setCantidad(cantidad2);
        fd2.setProducto(producto2);
        fd2.setPrecio(precio2);
        fd2.setParcial(parcial2);
        fd2.setFactura(facturaEntity);
        
        int cantidad3 =    Integer.parseInt(request.getParameter("cantidad3"));
        String producto3 = request.getParameter("producto3");
        double precio3 = Double.parseDouble(request.getParameter("precio3"));
        String parcial3 = request.getParameter("parcial3");
        fd3.setCantidad(cantidad3);
        fd3.setProducto(producto3);
        fd3.setPrecio(precio3);
        fd3.setParcial(parcial3);
        fd3.setFactura(facturaEntity);
        
        listaFacturaDetalle.add(fd1);
        listaFacturaDetalle.add(fd2);
        listaFacturaDetalle.add(fd3);
        
        facturaEntity.setListaFacturaDetalle(listaFacturaDetalle);
        
        facturaService.insertarFactura(facturaEntity);
        return new ModelAndView("listaFactura", "lista", facturaService.getListaFacturas());
    }
}
