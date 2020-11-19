package com.ghac.tusahre.mongdb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;

@Data
@ToString
@Getter
@Setter
public class Tushare implements Serializable {

    private String id;
    private String type;
    private String data;
}
