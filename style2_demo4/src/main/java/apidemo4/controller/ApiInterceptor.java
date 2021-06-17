package apidemo4.controller;

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

    @Mapping(value = "**", before = true)
    public Result checkToken(Context ctx) {
        //检测有没有token（用 param 替代；方便手浏览器测试）
        if (ctx.param("t") == null) {

            //设为已处理（主接口就不会进去了）
            ctx.setHandled(true);

            //如果没有令牌；直接设定结果
            return Result.failure(403, "Missing authentication information");
        } else {
            return null;
        }
    }
}
