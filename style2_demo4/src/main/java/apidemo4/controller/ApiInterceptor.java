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
    //
    // after=true 或 before=true，则不能返回值
    //
    @Mapping(value = "**", after = true)
    public void check404(Context ctx) throws Throwable{
        //如果未处理，或状态为404；则输出404提示
        if (ctx.getHandled() == false || ctx.status() == 404) {
            ctx.setHandled(true);
            ctx.render(Result.failure(ApiCodes.CODE_4001011.getCode(), ApiCodes.CODE_4001011.getDescription()));
        }
    }
}
