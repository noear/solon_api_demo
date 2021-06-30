package apidemo3.controller;

import org.noear.snack.ONode;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.ModelAndView;
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

        //
        // 有可能根本没数据过来
        //
        if (obj instanceof ModelAndView) {
            //如果有模板，则直接渲染
            //
            ctx.result = obj;
        } else {
            //如果没有按Result tyle 渲染
            //
            Result result = null;
            if (obj instanceof ApiCode) {
                //处理标准的状态码
                ApiCode apiCode = (ApiCode) obj;

                result = Result.failure(apiCode.getCode(), apiCode.getDescription());
            } else if (obj instanceof Throwable) {
                //处理未知异常
                ApiCode apiCode = ApiCodes.CODE_400;

                result = Result.failure(apiCode.getCode(), apiCode.getDescription());
            } else if (obj instanceof ONode) {
                //处理ONode数据（为兼容旧的）
                result = Result.succeed(obj);
            } else if (obj instanceof Result) {
                //处理Result结构
                result = (Result) obj;
            } else {
                //处理java bean数据（为扩展新的）
                result = Result.succeed(obj);
            }

            ctx.result = result;
        }


        //如果想对输出时间点做控制，可以不在这里渲染（由后置拦截器进行渲染）
        ctx.render(ctx.result);
    }
}
