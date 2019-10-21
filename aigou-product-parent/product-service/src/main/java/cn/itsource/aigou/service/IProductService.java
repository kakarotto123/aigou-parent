package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.domain.Specification;
import cn.itsource.aigou.query.ProductQuery;
import cn.itsource.aigou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author kakarotto
 * @since 2019-10-17
 */

public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);

    /**
     * 根据商品ID查询商品的显示属性
     * @param productId
     * @return
     */
    List<Specification> getViewProperties(Long productId);

    /**
     * 修改显示属性
     * @param productId
     * @param specifications
     */
    void saveViewProperties(Long productId, List<Specification> specifications);

    /**
     * 根据商品ID查询商品的sku属性
     * @param productId
     * @return
     */
    List<Specification> getSkuProperties(Long productId);

    /**
     * 修改sku属性
     * @param productId
     * @param skuProperties
     * @param skus
     */
    void saveSkuProperties(Long productId, List<Specification> skuProperties, List<Map<String, String>> skus);

    /**
     * 批量上架
     * @param ids
     */
    void onSale(List<Long> ids);

    /**
     * 批量下架
     * @param ids
     */
    void offSale(List<Long> ids);
}
