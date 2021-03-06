
package br.ufsc.ine5605.sisorientacao;

public class Orientacao {
    
    private String tituloTrabalho;
    
    private Professor orientador;
    
    private Aluno orientando;
    
    public Orientacao(Professor orientador, Aluno orientando, String tituloTrabalho){
        
        this.tituloTrabalho = tituloTrabalho;
        
        this.orientador = orientador;
        
        this.orientando = orientando;
        
    }
    
    public String getTituloTrabalho() {
        
        return tituloTrabalho;
        
    }

    public Professor getOrientador() {
        
        return orientador;
        
    }

    public Aluno getOrientando() {
        
        return orientando;
        
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        
        this.tituloTrabalho = tituloTrabalho;
        
    }

    public void setOrientador(Professor orientador) {
        
        this.orientador = orientador;
        
    }

    public void setOrientando(Aluno orientando) {
        
        this.orientando = orientando;
        
    }
    
    
    
}
