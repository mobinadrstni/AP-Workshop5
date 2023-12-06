public class ReferenceBook extends Book{
    private boolean referenceSection;
    public ReferenceBook(String id, String name, String auther, boolean referenceSection){
        super(id,name,auther);
        this.referenceSection = this.referenceSection;
    }

    public void displayInfo(String id, String name, String auther,boolean referenceSection) {
        super.displayInfo(id, name, auther);
        if(this.referenceSection){
            System.out.println("this is a reference book.");
        }
    }

    public boolean isReferenceSection() {
        return referenceSection;
    }

    public void setReferenceSection(boolean referenceSection) {
        this.referenceSection = referenceSection;
    }
}
