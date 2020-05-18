/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import Classes.Vinculo;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Augusto
 */
public class ArquivoInVinculo {
    private FileInputStream fin = null;
    private ObjectInputStream objIn = null;
    
    public void abrir() throws FileNotFoundException, IOException {
        fin = new FileInputStream("informacoes_vinculo.txt");
        objIn = new ObjectInputStream(fin);
    }
    
    public void fechar() {
        try {
            objIn.close();
            fin.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInVinculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Vinculo getvinculo() throws IOException, ClassNotFoundException {
        Vinculo vinculo = null;

        try {
            vinculo = (Vinculo) objIn.readObject();
        } catch (EOFException ex) {
            vinculo = null;
        }
        return vinculo;
    }
    
    public List getTodosVinculos() {
        List<Vinculo> lista = new ArrayList<Vinculo>();

        try {
            this.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoInVinculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInVinculo.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        Vinculo vinculo = null;
        while (continua) {
            try {
                vinculo = (Vinculo) objIn.readObject();
                lista.add(vinculo);
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoInVinculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fechar();
        return lista;
    }
}
