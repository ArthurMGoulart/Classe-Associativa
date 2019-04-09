
package br.ufsc.ine5605.sisorientacao; 

public class ClasseAssociativa { 

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("123","aluno1");
        
        Aluno aluno2 = new Aluno("456","aluno2");
        
        Aluno aluno3 = new Aluno("789","aluno3");
        
        Professor professor1 = new Professor("prof1", "111");
        
        Professor professor2 = new Professor("prof2", "222");
        
        Professor professor3 = new Professor("prof3", "333");
        
        Orientacao orientacao1 = new Orientacao(professor1, aluno1, "TCC do Aluno 1");
        
        Orientacao orientacao2 = new Orientacao(professor2, aluno2, "TCC do Aluno 2");
        
        Orientacao orientacao3 = new Orientacao(professor3, aluno3, "TCC do Aluno 3");
        
        aluno1.setOrientacao(orientacao1);
        
        aluno2.setOrientacao(orientacao2);
        
        aluno3.setOrientacao(orientacao3);
        
        professor1.addOrientacao(orientacao1);
        
        professor2.addOrientacao(orientacao2);
        
        professor3.addOrientacao(orientacao3);
        
        for(Orientacao orientacao : professor1.getOrientacoes()){
        
            System.out.println("Aluno matricula : " + orientacao.getOrientando().getMatricula());
        
        }
        
        System.out.println("Aluno 1 - Orientador : " + aluno1.getOrientacao().getOrientador().getCodigoFuncional());
        
    }
    
}
