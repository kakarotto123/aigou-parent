package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.ProductType;
import cn.itsource.aigou.vo.ProductTypeCrumbVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author kakarotto
 * @since 2019-10-12
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     *
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();

    /**
     * 生成静态页面方法
     */
    void genHomePage();

    /**
     * 加载类型面包屑
     * @param productTypeId
     * @return
     */
    List<ProductTypeCrumbVo> loadTypeCrumb(Long productTypeId);
}
