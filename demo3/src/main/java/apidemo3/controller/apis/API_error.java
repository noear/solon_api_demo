package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Result;


/**
 * 接口开发，与控制器开发差不多的
 *
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_error extends ApiBase {
    @Mapping("error")
    public void exec() {
        throw new RuntimeException("随便报一下");
    }
}
