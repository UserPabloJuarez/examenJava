/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.examen.dao.repository;

import edu.cibertec.examen.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fredyarev25
 */

public interface FacturaRepositorio extends JpaRepository<FacturaEntity, Integer> {
    
}
