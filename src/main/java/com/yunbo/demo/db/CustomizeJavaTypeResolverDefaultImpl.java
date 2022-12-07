package com.yunbo.demo.db;

import java.sql.Types;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class CustomizeJavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {

    public CustomizeJavaTypeResolverDefaultImpl() {
        super();
        super.typeMap.put(Types.TINYINT,
            new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
