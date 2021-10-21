
package cap4_InstrucoesdeControle.IF_ELSE;


public class Student {
    
    private String name;
    private double media;
    
    public Student(String name, double media){ // construtor inicializa variáveis de instância
        
        this.name = name;
        
        // valida que a média é > 0.0 e <= 100.0; caso contrário,
        // armazena o valor padrão da média da variável de instância (0.0) 
        if (media >0){
            if (media <=10){
                this.media = media;
            }
        }
    }
    
    public void setName (String name){// define o nome de Student
        this.name = name;
    }
    
    public String getName(){// recupera o nome de Student
        return name;    
    }
    
    public double getMedia(){// recupera a média de Student
        return media;
    }
    
    public String resultado(){  //DEFINE O RESULTADO
        String resultado = "";
        
        if (media>=9){
            resultado="A";
        } else if (media>=8){
            resultado="B";
        } else if (media>=7){
            resultado="C";
        } else if (media>=6){
            resultado="D";
        }else {
            resultado="F";
        }
        
        return resultado;
    }
    
}
