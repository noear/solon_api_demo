package apidemo3.controller.apis;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Result;

/**
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_db {
    @Mapping("db")
    public Result exec() {
        throw new RuntimeException("随便报一下");
    }
}
