public class Book {
    private String title;
    private int pages;
    private boolean available;
    
    static int count = 0;

    Book(String title, int pages, boolean available){
        this.title = title;
        this.pages= pages;
        this.available=available;
        count++;
    }

    Book(String title, int pages){
        this(title, pages, true);
    }

    void checkOut(){
        this.setAvailable(false);
    }

    public void setPages(int page){
        if(page>0){
            this.pages = page;
        } else{
            System.out.println("Rejected: Pages must be positive \n");
        }
    }

    public String getTitle(){
        return this.title;
    }

    
    public void setTitle(String title){
        if(title != null && !title.isEmpty()){
            this.title = title;
        } else{
            System.out.println("Rejected: Title cannot be empty \n");
        }
    }

    public int getPages(){
        return this.pages;
    }
    
    public void setAvailable(boolean available){
        if(available == this.available){
            System.out.println("The current book already has this availibility \n");
        }
        else{
            this.available = available;
        }
    }

    public boolean getAvailibility(){
        return this.available;
    }

    void printInfo(){
        System.out.println("Title : "+ getTitle() + "\npages : " + getPages() + "\navailibility : " + getAvailibility());
    }
            
}
