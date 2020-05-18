/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import Classes.Automovel;
import Classes.Pessoa;
import Classes.Vinculo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Pedro Augusto
 */
public class CreatedFileVinculo {
    
     public static void main(String[] args) {
             try {
                    FileOutputStream fout = new FileOutputStream("informacoes_vinculo.txt");
                    ObjectOutputStream objOut = new ObjectOutputStream(fout);
                    
                    Vinculo vinc = new Vinculo();
                    
                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome("Pedro");
                    pessoa.setCpf("999.999.999-99");
                    pessoa.setDataNascimento("01/01/0001");
                    pessoa.setCnh("99999999");
                    pessoa.setCep("99999-999");
                    pessoa.setEstado("MG");
                    pessoa.setCidade("Juiz de Fora");
                    pessoa.setBairro("Granbery");
                    pessoa.setNumero("999");
                    pessoa.setEndereco("Granbery");
                    
                   
                   
        
                    Automovel auto = new Automovel();
                    auto.setPlaca("ABC-1234");
                    auto.setModelo("Uno");
                    auto.setData("1996");
                    auto.setValorBasico(10000);
                    auto.setMotorizacao("1.0");
                    auto.setCategoria("Carga");
                    
                    vinc.setPes(pessoa);
                    vinc.setAuto(auto);
                    
                   objOut.writeObject(vinc);
                   
                   objOut.close();
                   
             } catch (IOException e) {
                    e.printStackTrace();
             }
  
       }
}
