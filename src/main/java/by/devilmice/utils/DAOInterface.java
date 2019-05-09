package by.devilmice.utils;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

public abstract interface DAOInterface<T>  {
    public void add(T entity);
    public void delete(int id);
    public void edit(T entity);
    public T getById(int id);
    public ArrayList<T> getAll();
}
