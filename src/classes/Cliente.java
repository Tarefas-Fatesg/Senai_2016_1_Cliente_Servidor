/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author harlock
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int id;
    private ArrayList<Telefone> listaTel;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Telefone> getListaTel() {
        return listaTel;
    }

    public void setListaTel(ArrayList<Telefone> listaTel) {
        this.listaTel = listaTel;
    }
    
    
}
