package mytaobao.android.cn.mytaobao.daompl;

import java.util.List;

import mytaobao.android.cn.mytaobao.R;//系统可能优先导入android.R这个包，一定要改成这种，这才是自己的包
import mytaobao.android.cn.mytaobao.dao.IProductService;
import mytaobao.android.cn.mytaobao.modle.Product;

/**
 * Created by PU YUE on 2017/3/24.
 */

public class ProductService implements IProductService{

    private Product[] products=(
            new Product(1,"三星note7","1", R.drawable.pic1 , 1630,"网络类型3G"),
            new Product(2,"小米5","1", R.drawable.pic2 ,1999,"网络类型4G")
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
