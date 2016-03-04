package hello.service;

import hello.mapper.UserInfo;
import hello.mapper.UserInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component( "userService")
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserInfoMapper userInfoMapper;
    
    @Override
    public UserDetails loadUserByUsername(String userid)
            throws UsernameNotFoundException {
        
        try {
            UserInfo userInfo = userInfoMapper.get( userid);
            if( userInfo == null) {
                throw new UsernameNotFoundException( "user not found");
            }
            return userInfo;
        } catch( UsernameNotFoundException une) {
            throw une;
        } catch( Exception e) {
            throw new UsernameNotFoundException("user not found", e);
        }
    }
}
