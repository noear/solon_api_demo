package apidemo3.controller.apis;

import apidemo3.controller.ApiBase;
import apidemo3.dso.service.AppxService;
import apidemo3.model.AppxModel;
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
    AppxService appxService;

    @NotZero("userId")
    @Mapping("db")
    public AppxModel exec(int appId) throws SQLException {
        return appxService.getAppx(appId);
    }
}
