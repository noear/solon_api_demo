package apidemo1;

import org.noear.solon.Solon;

/**
 * @author noear 2021/6/11 created
 */
public class App {
    public static void main(String[] args) {
        Solon.start(App.class, args);

        /**
         * 执行之后，可打开以下地址测试：
         *
         * //正常接口：
         * http://localhost:8081/api/hello?name=noear
         *
         * //不存在接口
         * http://localhost:8081/api/
         * http://localhost:8081/api/xxx/zzz
         *
         * */
    }
}
