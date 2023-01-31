package apidemo2.controller;

import org.noear.solon.annotation.Component;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;
import org.noear.solon.core.handle.Result;
import org.noear.solon.core.route.RouterInterceptor;
import org.noear.solon.core.route.RouterInterceptorChain;

/**
 * @author noear 2021/6/17 created
 */
@Component
public class ApiInterceptor implements RouterInterceptor {
    @Override
    public void doIntercept(Context ctx, Handler mainHandler, RouterInterceptorChain chain) throws Throwable {
        //检测有没有token（用 param 替代；方便手浏览器测试）
        if (ctx.param("t") == null) {

            //设为已处理（主接口就不会进去了）
            ctx.setHandled(true);

            //如果没有令牌；直接设定结果
            ctx.render(Result.failure(403, "Missing authentication information"));
            return;
        }

        chain.doIntercept(ctx, mainHandler);

        //如果未处理，或状态为404；则输出404提示
        if (ctx.getHandled() == false || ctx.status() == 404) {
            ctx.setHandled(true);
            ctx.render(Result.failure(404, "Interface does not exist"));
        }
    }
}
