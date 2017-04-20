import java.util.Date;
import java.text.SimpleDateFormat;

public class FeaturedProductCategory extends ProductCategory {
    Date startDate = new Date();
    Date endDate = new Date();

    public FeaturedProductCategory(Date startDate, Date endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }
}