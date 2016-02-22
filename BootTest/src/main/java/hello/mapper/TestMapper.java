package hello.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

public interface TestMapper {
	public void set( @Param("name")String name) throws Exception;
	public HashMap<String, ?> get(@Param("name")String name) throws Exception;
}
