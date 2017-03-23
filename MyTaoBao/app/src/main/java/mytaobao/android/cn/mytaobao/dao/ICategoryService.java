package mytaobao.android.cn.mytaobao.dao;

import java.util.List;

import mytaobao.android.cn.mytaobao.modle.Category;

/**
 * Created by PU YUE on 2017/3/24.
 */

public interface ICategoryService {
    /**
     * 得到系统所有类别
     * @return 所有类别
     */
    public List<Category> GetAllCategory();

    /**
     * 根据类别ID获得类别实体
     * @param categoryId
     * @return 类别实体
     */
    public Category gerCategoryById(int categoryId);
}
