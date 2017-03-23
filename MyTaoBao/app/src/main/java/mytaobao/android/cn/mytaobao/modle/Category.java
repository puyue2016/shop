package mytaobao.android.cn.mytaobao.modle;

/**类别实体
 * Created by PU YUE on 2017/3/24.
 */

public class Category {

    private  int    categoryId;
    private  String  categoryName;

    /**
     * 重写get set
     * @return
     */
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 重写构造函数
     * @param categoryId
     * @param categoryName
     */
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    /**
     * 定义一个无参数函数
     */
    public Category(){}

}
