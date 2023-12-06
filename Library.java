import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> people;
    public Library(ArrayList<Book> books, ArrayList<Person> people){
        this.books=new ArrayList<Book>();
        this.people=new ArrayList<Person>();
    }

    public Library() {
        this.books=new ArrayList<>();
        this.people=new ArrayList<>();
    }

    public Book addBookToLibrary(String id,String name,String auther){
        Book book = new Book(id, name, auther);
        books.add(book);
        return book;
    }
    public EBook addEbookToLibrary(String id, String name, String auther , String format){
        EBook eBook=new EBook(id, name, auther, format);
        books.add(eBook);
        return eBook;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public ReferenceBook addReferenceBookToLibrary(String id,String name,String auther,boolean reference){
        ReferenceBook refrenceBook=new ReferenceBook(id,name,auther,reference);
        books.add(refrenceBook);
        return refrenceBook;
    }
    public EBook addEBookToLibrary(String id,String name,String auther,String format){
        EBook eBook1=new EBook(id,name,auther,format);
        return eBook1;
    }
    public Student addStudent(String name,String contactInfo,String studentId){
        Student student1=new Student(name,contactInfo,studentId);
        return student1;
    }
    public Professor addProfessor(String name,String contactInfo,String employeeID){
        Professor professor1=new Professor(name,contactInfo,employeeID);
        return professor1;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public void displayAllBooks() {
        for (Book book : books) {
          book.displayInfo(book.getId(),book.getName(),book.getAuther());
        }
    }
    public double calculateTotalLibraryValue() {
        double totalValue = 0.0;
        for (Book book : books) {
            totalValue += 300;
        }
        return totalValue;
    }



}
