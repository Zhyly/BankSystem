package edu.fjnu501.service.shiro;

import edu.fjnu501.domain.Customer;
import edu.fjnu501.mapper.CustomerMapper;
import edu.fjnu501.utils.MD5Password;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class BankRealm extends AuthenticatingRealm {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();

        Customer customer = customerMapper.getUserByUsername(username);
        if (customer == null) {
            throw new UnknownAccountException("账号不存在");
        }

        AuthenticationInfo info = new SimpleAuthenticationInfo(customer, customer.getPassword(), ByteSource.Util.bytes(customer.getUsername() + MD5Password.getShiroSalt()), getName());
        return info;
    }

}
