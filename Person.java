public class Person {
    private String name;
    private String contactInfo;
    public Person(String name,String contactInfo){
        this.contactInfo=contactInfo;
        this.name=name;
    }
    public void displayInfo(){
        System.out.println("name: "+name+" contactInfo: "+contactInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean borrowBook(Library library, Book book){
        if (library.getBooks().contains(book)){
            library.getBooks().remove(book);
            System.out.println("the book "+book.getName()+"has been borrowed");
            return true;
        }
        else {
            System.out.println("the book "+book.getName()+"is not available in library");
            return false;
        }
    }
    public void returnBook(Library library, Book book) {
        library.getBooks().add(book);
        System.out.println("The book " + book.getName() + " has been returned.");
    }

    public void buyBook(Library library,Book book) {
        if (library.getBooks().contains(book)){
            library.getBooks().remove(book);
            System.out.println("the book "+book.getName()+"has been buy");
        }
        else {
            System.out.println("the book "+book.getName()+"is not available in library");
        }
    }
}
