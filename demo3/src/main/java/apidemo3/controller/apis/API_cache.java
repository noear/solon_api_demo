package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Result;

/**
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_cache extends ApiBase {
    @Mapping("cache")
    public void exec() {
        throw new RuntimeException("随便报一下");
    }
}
