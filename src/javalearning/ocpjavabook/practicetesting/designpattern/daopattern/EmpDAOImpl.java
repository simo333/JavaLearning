package javalearning.ocpjavabook.practicetesting.designpattern.daopattern;

import java.util.Collection;

public class EmpDAOImpl implements EmpDAO{
    @Override
    public int create(Employee e) {
        return 0;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public boolean delete(Employee e) {
        return false;
    }

    @Override
    public boolean update(Employee e) {
        return false;
    }

    @Override
    public Collection<Employee> getAll() {
        return null;
    }
}
