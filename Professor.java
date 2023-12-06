public class Professor extends Person{
    private String employeeID;
    public Professor(String name,String contactInfo,String employeeID){
        super(name, contactInfo);
        this.employeeID=employeeID;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("employee ID: " + employeeID);
    }
    public boolean borrowBook(Library library, Book book) {
        if (library.getBooks().equals(book)) {
            System.out.println("Professor has borrowed the book:" + book.getName());
            return true;
        } else {
            System.out.println("the book:" + book.getName() + " is not available in library");
            return false;
        }
    }
    public void returnBook(Library library, Book book) {
        super.returnBook(library, book);
        System.out.println("The professor has returned the book " + book.getName() + ".");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void buyBook(Library library, Book book) {
        if (book instanceof EBook) {
            System.out.println("the professor can not buy  electronic book");
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
