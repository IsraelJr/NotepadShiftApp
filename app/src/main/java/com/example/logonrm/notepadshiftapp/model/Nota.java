package com.example.logonrm.notepadshiftapp.model;


import com.google.gson.annotations.SerializedName;

public class Nota {

    private String id;
    private String titulo;
    @SerializedName(value = "texto")
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

