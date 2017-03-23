package mytaobao.android.cn.mytaobao.daompl;

import java.util.List;

import mytaobao.android.cn.mytaobao.R;
import mytaobao.android.cn.mytaobao.dao.IProductService;
import mytaobao.android.cn.mytaobao.modle.Product;

/**
 * Created by PU YUE on 2017/3/24.
 */

public class ProductService implements IProductService{

    private Product[] products=(
            new Product(1,"三星note7","1", R.drawable.menu_new_user,"1630元","网络类型3G"),
            new Product(2,"小米5","1", R.drawable.menu_new_user,"1999元","网络类型4G")
            );

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int ProductId) {
        return null;
    }

    @Override
    public List<Product> getByName(String name) {
        return null;
    }

    @Override
    public void Insert(Product product) {

    }

    @Override
    public void Modify(Product product) {

    }

    @Override
    public void Del(int id) {

    }
}
