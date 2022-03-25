package javalearning.ocpjavabook.practicetesting.designpattern.daopattern;

import java.util.Collection;

public interface EmpDAO {
    public int create(Employee e);
    public Employee get(int id);
    public boolean delete(Employee e);
    public boolean update(Employee e);
    public Collection<Employee> getAll();
}
