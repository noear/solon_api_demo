package apidemo3.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AppxModel implements Serializable {
    private int agroup_id;
    private String note;
    private String app_key;
    private int app_id;
    private int ar_is_examine;
}
