package mytaobao.android.cn.mytaobao.modle;

/**产品实体
 * Created by PU YUE on 2017/3/24.
 */

public class Product {
    private  int id;
    private  String name;
    private int categoryId;
    private int photo;
    private double unitPrice;
    private String note;

    /**
     * 重写get set
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 重写构造函数
     * @param id
     * @param name
     * @param categoryId
     * @param
     * @param unitPrice
     * @param note
     */
    public Product(int id, String name, int categoryId, int photo, double unitPrice, String note) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.photo = photo;
        this.unitPrice = unitPrice;
        this.note = note;
    }

    /**
     * 定义一个无参数函数
     */
    public Product(){}




    /**
     * 重写tostring
     * @return
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", photo=" + photo +
                ", unitPrice=" + unitPrice +
                ", note='" + note + '\'' +
                '}';
    }
}
