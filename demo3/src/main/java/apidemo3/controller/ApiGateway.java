package apidemo3.controller;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Gateway;
import org.noear.solon.core.handle.Result;

/**
 * 一个简单的接口网关
 *
 * @author noear 2021/6/11 created
 */
@Mapping("/api/**")
@Component
public class ApiGateway extends ApiGatewayBase {
    @Override
    protected void register() {

        //添加个拦截器
        before(c -> {
            //检测有没有token（用 param 替代；方便手浏览器测试）
            if (c.param("t") == null) {
                throw ApiCodes.CODE_4001021;
            }
        });

        //添加Bean
        addBeans(bw -> "api".equals(bw.tag()));
    }
}
