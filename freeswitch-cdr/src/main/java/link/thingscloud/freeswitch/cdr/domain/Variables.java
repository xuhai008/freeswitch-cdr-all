package link.thingscloud.freeswitch.cdr.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Variables class.</p>
 *
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 * @version $Id: $Id
 */
@Data
@Accessors(chain = true)
public class Variables {
    private Map<String, String> variables;

    /**
     * <p>putVariable.</p>
     *
     * @param key   a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void putVariable(String key, String value) {
        if (variables == null) {
            variables = new HashMap<>(256);
        }
        variables.put(key, value);
    }
}
