
package br.ufsc.ine5605.sisorientacao;

public class Aluno extends Pessoa{
    
    private String matricula;
    
    private Orientacao orientacao;
    
    public Aluno(String nome, String matricula, Orientacao orientacao){
        
        super(nome);
        
        this.matricula = matricula;
        
        this.orientacao = orientacao;
        
    }

    public Aluno(String matricula, String nome) {
        
        super(nome);
        
        this.matricula = matricula;
        
        this.orientacao = null;
        
    }
    
    public Orientacao getOrientacao() {
        
        return orientacao;
        
    }

    public void setOrientacao(Orientacao orientacao) {
        
        this.orientacao = orientacao;
        
    }
    
    public String getMatricula(){
    
        return this.matricula;
        
    }
    
    public void setMatricula(String matricula){
    
        this.matricula = matricula;
        
    }
    
    
    
}
