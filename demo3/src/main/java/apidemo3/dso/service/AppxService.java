package apidemo3.dso.service;

import apidemo3.model.AppxModel;
import org.noear.solon.extend.aspect.annotation.Service;
import org.noear.weed.DbContext;
import org.noear.weed.annotation.Db;

import java.sql.SQLException;

/**
 * @author noear 2021/6/11 created
 */
@Service
public class AppxService {

    @Db
    DbContext db;

    public AppxModel getAppx(int app_id) throws SQLException {
        //
        //随便写个示例
        //
        return db.table("appx").whereEq("app_id", app_id).limit(1).selectItem("*", AppxModel.class);
    }
}
