package mytaobao.android.cn.mytaobao.daompl;

import java.util.ArrayList;
import java.util.List;

import mytaobao.android.cn.mytaobao.dao.ICategoryService;
import mytaobao.android.cn.mytaobao.modle.Category;

/**
 * Created by PU YUE on 2017/3/24.
 */

public class CategoryService implements ICategoryService{
    List<Category> categories=new ArrayList<Category>();
    @Override
    public List<Category> GetAllCategory() {


        categories.add(new Category(1,"手机"));
        categories.add(new Category(2,"电器"));
        categories.add(new Category(3,"服装"));
        categories.add(new Category(4,"图书"));
        return categories;

    }

    @Override
    public Category gerCategoryById(int categoryId) {
        if(categories   !=null)
            return this.categories.get(categoryId-1);
        else
            return null;
    }
}
