package apidemo2.controller;

import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Render;
import org.noear.solon.core.handle.Result;

/**
 * @author noear 2021/6/11 created
 */
public class ApiBase implements Render {
    @Override
    public void render(Object obj, Context ctx) throws Throwable {
        if (ctx.getRendered()) {
            return;
        }

        //如果是异常
        if (obj instanceof Throwable) {
            ctx.render(Result.failure("unknown error"));
            return;
        }

        ctx.render(obj);
    }
}
