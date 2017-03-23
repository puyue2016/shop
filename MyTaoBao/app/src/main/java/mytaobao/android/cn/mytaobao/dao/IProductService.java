package mytaobao.android.cn.mytaobao.dao;

import java.util.List;

import mytaobao.android.cn.mytaobao.modle.Product;

/**
 * Created by PU YUE on 2017/3/24.
 */

public interface IProductService {
    /**
     * 得到所有商品
     * @return
     */
    public List<Product> getAll();

    /**
     * 根据主键ID获得商品实体
     * @param ProductId
     * @return
     */
    public  Product getById(int ProductId);

    /**
     * 根据商品名称模糊查询
     * @param name
     * @return
     */
    public List<Product> getByName(String name);

    /**
     * 添加一个商品
     * @param product
     */
    public void Insert(Product product);

    /**
     * 修改一个商品信息
     * @param product
     */
    public void Modify(Product product);

    /**
     * 删除一个商品
     * @param id
     */
    public void Del(int id);


}
