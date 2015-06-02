package com.weibo.interf;

import java.sql.ResultSet;
import java.util.List;

public interface PackageEntity {
	public List<Object> packageEntity(ResultSet rs) throws Exception;
}
