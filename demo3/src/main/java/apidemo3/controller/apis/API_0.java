package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import apidemo3.controller.ApiCodes;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Result;


/**
 * 默认接口（没有对应接口时，就会到这里来）
 *
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_0 extends ApiBase {
    //没有印射值，即为默认接口
    @Mapping
    public void exec() {
       throw ApiCodes.CODE_4001011;
    }
}
