/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Cruzeiro;
import br.ifes.edu.poo.fabricanavios.cdp.Escuna;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import br.ifes.edu.poo.fabricanavios.cdp.CargaGeral;
import br.ifes.edu.poo.fabricanavios.cdp.Graneleiro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alessandro Eller
 */
public class FabricaNaviosV2Test {
    
    
    @Before    
    public void Before(){}
    
    
    
    @Test 
   public void criarCruzeiro()
   {
        Navio resultado = NavioManager.NAVIO.createCruzeiro();
       Assert.assertEquals(Cruzeiro.class ,resultado.getClass());
   }
   
   @Test 
   public void criarEscuna()
   {
        Navio resultado = NavioManager.NAVIO.createEscuna();
       Assert.assertEquals(Escuna.class ,resultado.getClass());
   }
   
   @Test 
   public void criarCargaGeral()
   {
        Navio resultado = NavioManager.NAVIO.createCargaGeral();
       Assert.assertEquals(CargaGeral.class ,resultado.getClass());
   }
   
   @Test 
   public void criarGraneleiro()
   {
        Navio resultado = NavioManager.NAVIO.createGraneleiro();
       Assert.assertEquals(Graneleiro.class ,resultado.getClass());
       System.out.println(Graneleiro.class);
   }
}