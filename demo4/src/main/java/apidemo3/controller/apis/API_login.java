package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/6/17 created
 */
@Component(tag = "api")
public class API_login extends ApiBase {
    @Mapping("login")
    public void exec() {

    }
}
