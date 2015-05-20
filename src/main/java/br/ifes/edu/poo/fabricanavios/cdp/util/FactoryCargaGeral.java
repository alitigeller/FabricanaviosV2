/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import br.ifes.edu.poo.fabricanavios.cdp.CargaGeral;

/**
 *
 * @author Alessandro Eller
 */
public class FactoryCargaGeral extends NavioCargasFactory {

    @Override
    public Navio Create() {
        Navio navioCargaGeral= new CargaGeral(150,12);
        return navioCargaGeral;
    }
    
}
