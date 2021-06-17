package apidemo4.controller.apis;

import apidemo4.controller.ApiBase;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/6/17 created
 */
@Component(tag = "api")
public class API_test_login extends ApiBase {
    @Mapping("test.login")
    public void exec() {

    }
}
