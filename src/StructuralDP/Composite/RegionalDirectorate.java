package StructuralDP.Composite;
                                                                //4
import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department{
    // Parent gibi dusunmeliyiz finans ve sales gibi classlari var

    List<Department> childDepartments;

    // childDepartmanlari parametre olarak alan conts.
    public RegionalDirectorate(List<Department> childDepartments){  // buraya hangi class konulursa child kismi buraya eklenicekchild
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().  // Akistaki butun name ler aliniyor once department a gidiyor sonra "finans", sonra "sales" geldi
                map(Department :: getName).  //
                collect(Collectors.joining(","));  // Finance, Sales joining ifadesi seklinde gelmesini sagliyor
     // joining --> akistaki ifadeleri birlestirip String donduruyor
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().  // Department in getemployees i getiriliyor
                flatMap(d->d.getEmployees().stream()).
                collect(Collectors.toList());
        // FlatMap : Stream i bvaska bir stream e cevirmek icin kullanilir
        // Bir giren degere karsilik birden fazla deger olabilir
     }
}
