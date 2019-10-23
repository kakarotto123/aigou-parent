package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.aigou.util.PageList;
import cn.itsource.aigou.vo.BrandVo;
import cn.itsource.aigou.vo.ProductTypeCrumbVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author kakarotto
 * @since 2019-10-12
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页高级查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);

    /**
     * 根据类型编号查询品牌信息
     * @param productTypeId
     * @return
     */
    BrandVo getByProductTypeId(Long productTypeId);
}
