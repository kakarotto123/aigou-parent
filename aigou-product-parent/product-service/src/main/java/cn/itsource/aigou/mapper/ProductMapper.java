package cn.itsource.aigou.mapper;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.domain.Specification;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.aigou.query.ProductQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author kakarotto
 * @since 2019-10-17
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * mapper接口返回类型为Ipage
     * mapper接口的第一个参数必须为Page
     * @param page
     * @param query
     * @return
     */
    IPage<Product> queryPage(Page page, @Param("query") ProductQuery query);

    /**
     * 修改显示属性 mapper接口中如果有多个参数需要在sql中获取作为参数需要绑定,使用@param注解
     * @param productId
     * @param viewProperties
     */
    void updateViewProperties(@Param("productId") Long productId,@Param("viewProperties") String viewProperties);


    /**
     * 修改sku属性
     * @param productId
     * @param skuPropertiesJson
     */
    void saveSkuProperties(@Param("productId")Long productId, @Param("skuProperties")String skuPropertiesJson);
}
