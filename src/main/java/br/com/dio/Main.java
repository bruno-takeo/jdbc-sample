package br.com.dio;

import br.com.dio.persistence.EmployeeDAO;
import br.com.dio.persistence.entity.EmployeeEntity;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Main {

    private final static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static void main(String[] args) {
        var flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/jdbc-sample", "root", "root")
                .load();
        flyway.migrate();

        /*var employee = new EmployeeEntity();
        employee.setName("Miguel");
        employee.setSalary(new BigDecimal("2800"));
        employee.setBirthday(OffsetDateTime.now().minusYears(18));
        System.out.println(employee);
        employeeDAO.insert(employee);
        System.out.println(employee);*/

        //employeeDAO.findAll().forEach(System.out::println);

        //System.out.println(employeeDAO.findById(1));

        /*var employee = new EmployeeEntity();
        employee.setId(3);
        employee.setName("Gabriel");
        employee.setSalary(new BigDecimal("5500"));
        employee.setBirthday(OffsetDateTime.now().minusYears(36).minusDays(10));
        employeeDAO.update(employee);*/

        //employeeDAO.delete(1);

    }

}
