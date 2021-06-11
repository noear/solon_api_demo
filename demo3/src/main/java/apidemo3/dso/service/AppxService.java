package apidemo3.dso.service;

import apidemo3.model.AppxModel;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Inject;
import org.noear.weed.DbContext;

import java.sql.SQLException;

/**
 * @author noear 2021/6/11 created
 */
@Component
public class AppxService {

    @Inject
    DbContext db;

    public AppxModel getAppx(int app_id) throws SQLException {
        //
        //随便写个示例
        //
        return db.table("appx").whereEq("app_id", app_id).limit(1).selectItem("*", AppxModel.class);
    }
}
