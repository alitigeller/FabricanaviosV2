/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import br.ifes.edu.poo.fabricanavios.cdp.Graneleiro;

/**
 *
 * @author Alessandro Eller
 */
public class FactoryGraneleiro extends NavioCargasFactory {

    @Override
    public Navio Create() {
        Navio navioGraneleiro = new Graneleiro(200, 6);
        return navioGraneleiro;
    }
    
}
