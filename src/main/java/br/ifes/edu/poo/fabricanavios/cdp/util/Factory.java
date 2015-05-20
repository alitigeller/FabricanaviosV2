/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import static br.ifes.edu.poo.fabricanavios.cdp.util.EnumNavio.CargaGeral;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import java.util.HashMap;

/**
 *
 * @author Alessandro Eller
 */
public class Factory {
    
    private HashMap<EnumNavio, Navio> factory = new HashMap();
    
    public Factory(){
        factory.put(EnumNavio.CargaGeral,new FactoryCargaGeral().Create());
        factory.put(EnumNavio.Graneleiro,new FactoryGraneleiro().Create());
        factory.put(EnumNavio.Cruzeiro,new FactoryCruzeiro().Create());
        factory.put(EnumNavio.Escuna,new FactoryEscuna().Create());
    }
    
    public Navio create(EnumNavio tipo){
     
        return factory.get(tipo);
     
    }
}
