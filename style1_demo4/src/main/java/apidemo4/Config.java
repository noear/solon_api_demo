package apidemo4;

import apidemo4.dso.valid.LoginedCheckerImpl;
import apidemo4.dso.valid.ValidatorFailureHandlerImpl;
import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;
import org.noear.solon.cache.jedis.RedisCacheService;
import org.noear.solon.core.handle.Context;
import org.noear.solon.data.cache.CacheService;
import org.noear.solon.validation.ValidatorFailureHandler;
import org.noear.solon.validation.ValidatorManager;
import org.noear.solon.validation.annotation.Logined;
import org.noear.solon.validation.annotation.LoginedChecker;

import javax.sql.DataSource;

/**
 * @author noear 2021/6/11 created
 */
@Configuration
public class Config {
    @Bean
    public void validatorFailureHandler() {
        //增加参数验证器的自定义处理(配套接口状态码)
        ValidatorManager.setFailureHandler(new ValidatorFailureHandlerImpl());
        //增加登录状态注解检测器支持
        ValidatorManager.setLoginedChecker(new LoginedCheckerImpl());
    }

    @Bean
    public CacheService cache1(@Inject("${demo.cache1}") RedisCacheService cacheService) {
        return cacheService;
    }

    @Bean
    public DataSource db1(@Inject("${demo.db1}") HikariDataSource ds) {
        return ds;
    }
}
