public class Book {
    private String id;
    private String name;
    private String auther;
    public Book(String id,String name,String auther){
        this.auther=auther;
        this.id=id;
        this.name=name;
    }


    public void displayInfo(String id,String name,String auther){
        System.out.println("id:"+id+" Name:"+name+" Auther:"+auther);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
