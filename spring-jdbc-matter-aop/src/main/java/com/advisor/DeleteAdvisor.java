package com.advisor;

import com.dao.EmployeeDaoImpl;
import com.service.EmployeeServiceImpl;
import com.util.SqlConnectionUtil;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;
import java.sql.SQLException;

public class DeleteAdvisor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object proceed = null;
        Object[] arguments = methodInvocation.getArguments();
        Connection conn = (Connection) arguments[0];

        try {
            conn.setAutoCommit(false);
            proceed = methodInvocation.proceed();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Throwable e) {
            System.out.println("失败");
            //错误回滚
            conn.rollback();
        }

        return proceed;
    }
}
