package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import apidemo3.dso.UserService;
import apidemo3.model.UserModel;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.extend.validation.annotation.NotZero;

import java.sql.SQLException;

/**
 * @author noear 2021/6/11 created
 */
@Component(tag = "api")
public class API_db extends ApiBase {

    @Inject
    UserService userService;

    @NotZero("userId")
    @Mapping("db")
    public UserModel exec(long userId) throws SQLException {
        return userService.getUser(userId);
    }
}
