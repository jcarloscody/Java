
package cap4_InstrucoesdeControle.IF_ELSE;


public class StudentTest {
    public static void main(String[] args) {
        
        Student objetoStudent1 = new Student("josue", 8);
        Student objetoStudent2 = new Student("juliana", 4);
        
        System.out.printf("O estudante %s tirou %s na prova %n", objetoStudent1.getName(), objetoStudent1.resultado());
        System.out.printf("O estudante %s tirou %s na prova %n", objetoStudent2.getName(), objetoStudent2.resultado());
    }
    
}
