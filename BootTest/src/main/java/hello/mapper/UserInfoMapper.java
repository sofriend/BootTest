package hello.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
	public void create( UserInfo userInfo) throws Exception;
	public List<UserInfo> list() throws Exception;
	public UserInfo get( @Param("userid")String userid) throws Exception;
}
