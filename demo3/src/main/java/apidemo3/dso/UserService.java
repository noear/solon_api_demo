package apidemo3.dso;

import apidemo3.model.UserModel;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Inject;
import org.noear.weed.DbContext;

import java.sql.SQLException;

/**
 * @author noear 2021/6/11 created
 */
@Component
public class UserService {

    @Inject
    DbContext db;

    public UserModel getUser(long id) throws SQLException {
        //
        //随便写个示例
        //
        return db.table("user").whereEq("id", id).limit(1).selectItem("*", UserModel.class);
    }
}
