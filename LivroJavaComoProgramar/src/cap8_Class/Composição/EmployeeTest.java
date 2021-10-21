
package cap8_Class.Composição;


public class EmployeeTest {
    public static void main(String[] args){
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        
        Employee employee = new Employee("first name", "last name", birth, hire);

        System.out.println(employee);
    }
    
}
