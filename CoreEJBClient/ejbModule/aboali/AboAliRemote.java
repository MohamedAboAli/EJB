package aboali;

import java.util.List;

import javax.ejb.Remote;

import model.Book;

@Remote
public interface AboAliRemote {

	public List<Book> getAllBooks();
}
