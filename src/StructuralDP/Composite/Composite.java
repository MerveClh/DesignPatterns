package StructuralDP.Composite;

import java.util.Arrays;

public class Composite  {
    public static void main(String[] args) {
        Composite composite = new Composite();                         //5.
        composite.CompositeDemo();

    }
    public void CompositeDemo(){
         Department financeDepartment  = new Finance();        // sol taraf interface yada abstarack class olmali
         Department salesDepartment  = new Sales();
         Department regionalDepartment = new RegionalDirectorate(
                 Arrays.asList(financeDepartment,salesDepartment));  // Benim regionalDirectorate isminde bir objem olusuyor bu objenin child departmaninda da

        System.out.println(regionalDepartment.getName()); // REgionalDirectorate clasindaki collect(Collectors.joining(",")); kismini calistiricak
        System.out.println("**********************");
        System.out.println(regionalDepartment.getEmployees());

    }
}
