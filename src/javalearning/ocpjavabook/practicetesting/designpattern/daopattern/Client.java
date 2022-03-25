package javalearning.ocpjavabook.practicetesting.designpattern.daopattern;

public class Client {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1; emp.name = "Szymon";
        emp.age = 25; emp.address = "PL";

        EmpDAO dao = new EmpDAOImpl();
        dao.create(emp);
        emp.name = "Zenon";
        dao.update(emp);

    }
}
