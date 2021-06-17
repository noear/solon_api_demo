package apidemo4.dso.valid;

import org.noear.solon.core.handle.Context;
import org.noear.solon.validation.annotation.Logined;
import org.noear.solon.validation.annotation.LoginedChecker;

/**
 * @author noear 2021/6/17 created
 */
public class LoginedCheckerImpl implements LoginedChecker {
    @Override
    public boolean check(Logined anno, Context ctx, String userKeyName) {
        return ctx.session("user_id", 0L) > 0L;
    }
}
