package apidemo3.controller;

import org.noear.snack.ONode;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Gateway;
import org.noear.solon.core.handle.ModelAndView;
import org.noear.solon.core.handle.Result;

/**
 * 自定义一个网关，对结果做了处理的转换处理
 *
 * @author noear 2021/6/11 created
 */
public abstract class ApiGatewayBase extends Gateway {
    @Override
    public void render(Object obj, Context c) throws Throwable {
        if (c.getRendered()) {
            return;
        }

        c.setRendered(true);

        //
        // 有可能根本没数据过来
        //
        if (obj instanceof ModelAndView) {
            //如果有模板，则直接渲染
            //
            c.result = obj;
            c.render(obj);
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

            c.result = result;
        }
    }
}
