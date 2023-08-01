package danielh1307.spring3cloudconfig.infrastructure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ConfigMapEnvProperties {

    @Value("${first_name}")
    private String my_first_name;

    public void setMy_first_name(String my_first_name) {
        this.my_first_name = my_first_name;
    }

    public String getMy_first_name() {
        return my_first_name;
    }
}
