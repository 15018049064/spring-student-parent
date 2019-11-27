package com.servlet;

import com.entity.Dept;
import com.github.pagehelper.PageInfo;
import com.service.DeptService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class DeptListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        DeptService bean = context.getBean(DeptService.class);
        int pageNum = ServletRequestUtils.getIntParameter(req, "pageNum", 1);
        int pageSize = ServletRequestUtils.getIntParameter(req, "pageSize", 3);
        List<Dept> all = bean.getAll(pageNum, pageSize);
        PageInfo<Dept> info = new PageInfo<>(all, 4);
        req.setAttribute("info",info);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
