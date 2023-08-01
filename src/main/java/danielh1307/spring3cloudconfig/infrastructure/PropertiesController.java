package danielh1307.spring3cloudconfig.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("properties")
public class PropertiesController {

    @Autowired
    private ConfigMapProperties configMapProperties;

    @Autowired
    private ConfigMapEnvProperties configMapEnvProperties;

    @GetMapping("/hello")
    public String hello() {
        return "Hello I'm here";
    }

    @GetMapping("/config-map")
    public String getConfigMapProperty() {
        return configMapProperties.getCmessage();
    }

    @GetMapping("/config-map-env")
    public String getConfigMapEnvProperty() {
        return configMapEnvProperties.getMy_first_name();
    }

}
