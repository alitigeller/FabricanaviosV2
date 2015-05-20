/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp;

/**
 *
 * @author Alessandro Eller
 */
public abstract class NavioCarga implements Navio{
    private int capacidadeCarga;
    private int capacidadePessoas;
    
    public NavioCarga() {
    }   

    public NavioCarga(int capacidadeCarga, int capacidadePessoas) {
        this.capacidadeCarga = capacidadeCarga;
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }
        
    
    public Object clone(){
        Object obj = null;
        try{
          obj=super.clone();
        }catch(CloneNotSupportedException x){
            
        }
        return obj;
    }
}
    