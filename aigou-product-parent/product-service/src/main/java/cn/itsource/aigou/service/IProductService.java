package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.query.ProductQuery;
import cn.itsource.aigou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

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
}
