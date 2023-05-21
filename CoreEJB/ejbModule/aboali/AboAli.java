package aboali;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Book;

/**
 * Session Bean implementation class AboAli
 */
@Stateless
public class AboAli implements AboAliRemote, AboAliLocal {

    /**
     * Default constructor. 
     */
	
	 @PersistenceContext(unitName="ConfigurationDB")
	private EntityManager entityManager;     
	
    public AboAli() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books= entityManager.createQuery("SELECT u FROM Book u", Book.class)
                .getResultList();;
	      return books;

	}

}
