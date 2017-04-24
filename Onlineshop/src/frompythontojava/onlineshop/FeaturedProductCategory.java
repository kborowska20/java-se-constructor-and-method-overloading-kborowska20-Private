import java.util.Date;
import java.text.SimpleDateFormat;

public class FeaturedProductCategory extends ProductCategory {
    private Date startDate;
    private Date endDate;

    public FeaturedProductCategory(String name, String departament, String description, Date startDate, Date endDate){
        super(name,departament,description);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean isavailable(){
        Date currentDate = new Date();
        if(currentDate.before(endDate) && currentDate.after(startDate)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "FeaturedProductCategory " + " id: " + id
                + " || name: " + name
                + " || departament: " + departament
                + " || discrription: " + description
                + " || startDate: " + startDate.toString()
                + " || endDate: " + endDate.toString();
    }
}