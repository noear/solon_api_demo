package apidemo1.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Result;

/**
 * @author noear 2021/6/17 created
 */
@Controller
public class ApiInterceptor {
    @Mapping(value = "**", after = true)
    public Result check404(Context ctx) {
        //如果未处理，或状态为404；则输出404提示
        if (ctx.getHandled() == false || ctx.status() == 404) {
            ctx.setHandled(true);
            return Result.failure(404, "Interface does not exist");
        } else {
            return null;
        }
    }
}
