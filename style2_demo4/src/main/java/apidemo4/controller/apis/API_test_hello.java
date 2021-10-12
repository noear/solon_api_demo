package apidemo4.controller.apis;

import apidemo4.controller.ApiBase;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.validation.annotation.Logined;
import org.noear.solon.validation.annotation.NoRepeatSubmit;


/**
 * 接口开发，与控制器开发差不多的; 但进入网关的接口，要用 @Component 注解
 *
 * @author noear 2021/6/11 created
 */
@Mapping("api")
@Controller
public class API_test_hello extends ApiBase {
    @NoRepeatSubmit
    @Logined //登录用户才可用
    @Mapping("test.hello")
    public String exec(String name) {
        return "Hello " + name;
    }
}
