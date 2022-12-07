package com.yunbo.demo.db;

import java.util.Properties;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class CommentGenerator extends DefaultCommentGenerator {

	@Override
	public void addConfigurationProperties(Properties properties) {
		super.addConfigurationProperties(properties);
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		String remarks = introspectedColumn.getRemarks();
		field.addJavaDocLine("/**");
		String[] remarkLines = remarks.split(System.getProperty("line.separator"));
		for (String remarkLine : remarkLines) {
			field.addJavaDocLine(" * " + remarkLine);
		}
		addJavadocTag(field, false);
		field.addJavaDocLine(" */");
	}
}
