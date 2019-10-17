package cn.itsource.aigou.mapper;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.aigou.query.ProductQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

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
}
