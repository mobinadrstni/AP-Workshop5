public class Student extends Person {
    private String studentId;

    public Student(String name, String contactInfo, String studentId) {
        super(name, contactInfo);
        this.studentId = studentId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    public boolean borrowBook(Library library, Book book) {
        if (library.getBooks().equals(book)) {
            System.out.println("Students has borrowed the book:" + book.getName());
            return true;
        } else {
            System.out.println("the book:" + book.getName() + " is not available in library");
            return false;
        }
    }

    public void returnBook(Library library, Book book) {
        super.returnBook(library, book);
        System.out.println("The student has returned the book " + book.getName() + ".");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void buyBook(Library library, Book book) {
        if (book instanceof ReferenceBook) {
            System.out.println("the student can not buy  reference book");
        }
        else {
            if (library.getBooks().contains(book)){
                library.getBooks().remove(book);
                System.out.println("the book "+book.getName()+"has been buy");
            }
            else {
                System.out.println("the book "+book.getName()+"is not available in library");
            }
        }
    }
}
