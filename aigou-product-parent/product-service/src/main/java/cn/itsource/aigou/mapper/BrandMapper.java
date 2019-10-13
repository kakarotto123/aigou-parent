package cn.itsource.aigou.mapper;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author kakarotto
 * @since 2019-10-12
 */
@Component
public interface BrandMapper extends BaseMapper<Brand> {

        /**
         *
         * 高级查询加分页
         * <p>
         * 查询 : 根据state状态查询用户列表，分页显示
         * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
         * </p>
         *mybatis-plus对自定义sql的分页查询
         * （1）返回类型为IPage
         * （2）第一个参数必须为Page
         *  (3)mybatis有多个参数
         *      @Param("query") BrandQuery query
         *      在sql中就可以使用#{query.keyword}获取到查询参数
         *
         * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
         * @param query 状态
         * @return 分页对象
         */
        IPage<Brand> queryPage(Page page, @Param("query") BrandQuery query);
}
