/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

/**
 *
 * @author Usuario
 */
public class Cancion {
    
    private String titulo;
    private String autor;
    private String fabian;
    
    public Cancion()
    {
        this.autor="";
        this.titulo="";
    }
    
    public Cancion(String AU, String TI)
    {
        this.autor=AU;
        this.titulo=TI;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    

    
    }  



