/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author Dell
 */
public interface DAOInterface<E> {

    public List<E> function(Object object, int t);

    public E getById(Object object, String id);
    

    public E getMaxId(Object object);

}
