package aplc.archive.tut5.tutorial.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Immutability issue noticed - resolved...
 *	//zhenyie
 */
public class Q6 {
	static final List<Book> bookList = Arrays.asList(
            new Book("When Breath Becomes Air", 8.8),
            new Book("The Universe Has Your Back", 5.6),
            new Book("A War and Peace", 7.9),
            new Book("One Hundred Years of Solitude", 7.9),
            new Book("Moby Dick", 4.3),
            new Book("The Great Wall", 7.0)
    );

	public static void main(String[] args) {
		System.out.println( "Original list >>>" );
		bookList.forEach( System.out :: println );
		
		List<Book> newBookList = bookList.stream()
				.sorted(Comparator.comparing(Book::getTitle).thenComparing(Book::getRating))
				.collect(Collectors.toList());
		show( newBookList );
		System.out.println();
		
		System.out.println( "Original list >>>" );
		bookList.forEach( System.out :: println );
	}
	
	static void show( List<Book> newBookList ) {
		System.out.println( "\nSorted list >>>" );
		newBookList.forEach( System.out :: println );
	}	
	
}
class Book{
    
    String title;
    double rating;

    public Book(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ";Rating=" + rating + '}';
    }
}
