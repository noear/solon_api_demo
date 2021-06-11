package apidemo1.controller.apis;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Result;


/**
 * 没有印射的接口，为默认接口
 *
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_0 {
    @Mapping
    public Result exec() {
        return Result.failure(404, "Interface does not exist");
    }
}
