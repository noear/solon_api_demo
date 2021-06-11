package apidemo3.dso.valid;

import apidemo3.controller.ApiCodes;
import org.noear.solon.annotation.Component;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Result;
import org.noear.solon.extend.validation.ValidatorFailureHandler;
import org.noear.solon.extend.validation.annotation.Logined;
import org.noear.solon.extend.validation.annotation.NoRepeatSubmit;
import org.noear.solon.extend.validation.annotation.Whitelist;

import java.lang.annotation.Annotation;

/**
 * 增加验证器的自定义处理
 *
 * @author noear 2021/6/11 created
 */
@Component
public class ValidatorFailureHandlerImpl implements ValidatorFailureHandler {

    @Override
    public boolean onFailure(Context ctx, Annotation ano, Result result, String message) {
        ctx.setHandled(true);

        Class<?> type = ano.annotationType();

        if (type.equals(NoRepeatSubmit.class)) {
            throw ApiCodes.CODE_4001015;
        } else if (type.equals(Whitelist.class)) {
            throw ApiCodes.CODE_4001016;
        } else if (type.equals(Logined.class)) {
            throw ApiCodes.CODE_4001021;
        } else {
            throw ApiCodes.CODE_4001014(result.getDescription());
        }
    }
}
