/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Navio;

/**
 *
 * @author aeller
 */
public enum NavioManager {
    NAVIO;
    private Navio cruzeiro, escuna, cargaGeral, graneleiro;
    
    Factory factory = new Factory();
    
    public synchronized Navio createCruzeiro(){
        if(cruzeiro == null){
            cruzeiro = factory.create(EnumNavio.Cruzeiro);
            return cruzeiro;
        }else{
            return (Navio) cruzeiro.clone();
        }
    }
    
    public synchronized Navio createEscuna(){
        if(escuna == null){
            escuna = factory.create(EnumNavio.Escuna);
            return escuna;
        }else{
            return (Navio) escuna.clone();
        }
    }
    
    public synchronized Navio createCargaGeral(){
        if(cargaGeral == null){
            cargaGeral = factory.create(EnumNavio.CargaGeral);
            return cargaGeral;
        }else{
            return (Navio) cargaGeral.clone();
        }
    }
    
    
    public synchronized Navio createGraneleiro(){
        if(graneleiro == null){
            graneleiro = factory.create(EnumNavio.Graneleiro);
            return graneleiro;
        }else{
            return (Navio) graneleiro.clone();
        }
    }
}
