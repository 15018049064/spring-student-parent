package config.tx;

import com.alibaba.druid.pool.DruidDataSource;
import com.aop.LoggerAop;
import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.dao.impl.DeptDaoImpl;
import com.dao.impl.EmployeeDaoImpl;
import com.service.DeptByEmployeeService;
import com.service.impl.DeptByEmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.logging.Logger;

@Configuration
//@ComponentScan("com")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AnnoSupportTxConfig {

    @Bean
    public LoggerAop loggerAop() {
        return new LoggerAop();
    }

    @Bean
    public DeptDao deptDao() {
        DeptDaoImpl deptDao = new DeptDaoImpl();
        deptDao.setJdbcTemplate(getJdbcTemplate());
        return deptDao;
    }

    @Bean
    public EmployeeDao employeeDao() {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.setJdbcTemplate(getJdbcTemplate());
        return employeeDao;
    }

    @Bean
    public DeptByEmployeeService deptEmployeeDao() {
        DeptByEmployeeServiceImpl deptByEmployeeService = new DeptByEmployeeServiceImpl();
        deptByEmployeeService.setDeptDao(deptDao());
        deptByEmployeeService.setEmployeeDao(employeeDao());
        return deptByEmployeeService;
    }


    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(getDataSource());
        return transactionManager;
    }


}
