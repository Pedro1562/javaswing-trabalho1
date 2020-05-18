/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Pedro Augusto
 */
public class Vinculo implements Serializable {
    private Pessoa pes;
    private Automovel auto;
    
    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public Automovel getAuto() {
        return auto;
    }

    public void setAuto(Automovel auto) {
        this.auto = auto;
    }

    public Vinculo(Pessoa pes, Automovel auto) {
        this.pes = pes;
        this.auto = auto;
    }

    public Vinculo() {
        pes = new Pessoa();
        auto = new Automovel();
    }
    
    public Object[] getvinculo() {
        Object vinculo[] = {pes.getNome(), auto.getModelo()};
        return vinculo;
    }
    
    
}
