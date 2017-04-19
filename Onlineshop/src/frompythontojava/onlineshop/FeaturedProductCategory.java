import java.util.Date;


class FeaturedProductCategory extends ProductCategory {
    Date startDate = new Date();
    Date endDate = new Date();

    public FeaturedProductCategory(Date startDate, Date endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }
}