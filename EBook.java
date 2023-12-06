public class EBook extends Book{
    private String format;
    public EBook(String id,String name,String auther,String format){
        super(id, name, auther);
        this.format=format;
    }


    public void displayInfo(String id, String name, String auther, String format) {
        super.displayInfo(id, name, auther);
        System.out.println("format:"+format);

    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
