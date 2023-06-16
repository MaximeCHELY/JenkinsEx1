import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils;

public class BookTest {

	@ParameterizedTest
	@MethodSource("checkBooks")
	public void testBookGetAuthor(Book book) {
		String expected = book.getAuthor();
		String author = book.getAuthor();
		assertEquals(expected, author);
	}
	
	@ParameterizedTest
	@MethodSource("checkBooks")
	public void testBookGetDate(Book book) {
		String expected = book.getDate();
		String author = book.getDate();
		assertEquals(expected, author);
	}
	
	@ParameterizedTest
	@MethodSource("checkBooks")
	public void testBookGetTitle(Book book) {
		String expected = book.getTitle();
		String author = book.getTitle();
		assertEquals(expected, author);
	}
	
	public static Stream<Book> checkBooks() {
		return Stream.of(
			new Book("","",""),
			new Book("titre","auteur","10-10-2010")
		);
	}

}
