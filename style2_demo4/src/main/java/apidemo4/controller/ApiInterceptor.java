package apidemo4.controller;

import org.noear.solon.annotation.Component;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;
import org.noear.solon.core.handle.Result;
import org.noear.solon.core.route.RouterInterceptor;
import org.noear.solon.core.route.RouterInterceptorChain;

/**
 * @author noear 2021/6/17 created
 */
//@Mapping(path="**", index=-1, after=true)
@Component(index = -1)
public class ApiInterceptor implements RouterInterceptor {

    @Override
    public void doIntercept(Context ctx, Handler mainHandler, RouterInterceptorChain chain) throws Throwable {

        chain.doIntercept(ctx, mainHandler);

        //如果未处理，或状态为404；则输出404提示
        if (ctx.getHandled() == false || ctx.status() == 404) {
            ctx.setHandled(true);
            ctx.render(Result.failure(404, "Interface does not exist"));
        }
    }
}
