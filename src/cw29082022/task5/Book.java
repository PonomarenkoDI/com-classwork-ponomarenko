package cw29082022.task5;

import java.time.LocalDate;
import java.util.Scanner;

public class Book {
    private String nameOfBook;
    private String nameSurnamePatronymicOfAuthor;
    private LocalDate yearsBornBook;
    private String nameOfIzdatelstva;
    private String bookGenre;
    private int quantityOfPages;

    private Scanner sc = new Scanner(System.in);

    public Book(String nameOfBook, String nameSurnamePatronymicOfAuthor, LocalDate yearsBornBook) {
        this.nameOfBook = nameOfBook;
        this.nameSurnamePatronymicOfAuthor = nameSurnamePatronymicOfAuthor;
        this.yearsBornBook = yearsBornBook;
    }

    public Book(String nameOfBook, String nameSurnamePatronymicOfAuthor, LocalDate yearsBornBook, int quantityOfPages) {
        this.nameOfBook = nameOfBook;
        this.nameSurnamePatronymicOfAuthor = nameSurnamePatronymicOfAuthor;
        this.yearsBornBook = yearsBornBook;
        this.quantityOfPages = quantityOfPages;
    }

    public Book(String nameOfBook,
                String nameSurnamePatronymicOfAuthor,
                LocalDate yearsBornBook,
                String nameOfIzdatelstva,
                String bookGenre,
                int quantityOfPages) {
        this.nameOfBook = nameOfBook;
        this.nameSurnamePatronymicOfAuthor = nameSurnamePatronymicOfAuthor;
        this.yearsBornBook = yearsBornBook;
        this.nameOfIzdatelstva = nameOfIzdatelstva;
        this.bookGenre = bookGenre;
        this.quantityOfPages = quantityOfPages;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook() {
        System.out.println("Введите название книги: ");
        this.nameOfBook = sc.nextLine();
    }

    public String getNameSurnamePatronymicOfAuthor() {
        return nameSurnamePatronymicOfAuthor;
    }

    public void setNameSurnamePatronymicOfAuthor() {
        System.out.println("Введите ФИО автора: ");
        this.nameSurnamePatronymicOfAuthor = sc.nextLine();
    }

    public LocalDate getYearsBornBook() {
        return yearsBornBook;
    }

    public void setYearsBornBook() {
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Введите дату рождения: ");
        this.yearsBornBook = LocalDate.of(year,month,day);
    }

    public String getNameOfIzdatelstva() {
        return nameOfIzdatelstva;
    }

    public void setNameOfIzdatelstva() {
        System.out.println("Введите название издательства: ");
        this.nameOfIzdatelstva = sc.nextLine();
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre() {
        System.out.println("Введите жанр книги: ");
        this.bookGenre = sc.nextLine();
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages() {
        System.out.println("Введите количество страниц: ");
        this.quantityOfPages = sc.nextInt();
    }
}
