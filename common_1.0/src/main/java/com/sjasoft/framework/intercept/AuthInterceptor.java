package com.sjasoft.framework.intercept;

//import com.alibaba.fastjson.JSON;
import com.sjasoft.framework.annotation.IgnoreSecurity;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
//import com.sjasoft.tqt.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//import sun.security.provider.certpath.OCSPResponse;

//import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.lang.reflect.Method;

public class AuthInterceptor extends HandlerInterceptorAdapter {

    protected Log logger = LogFactory.getLog(getClass());

    //@Resource
    //private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        // 如果不是映射到方法直接通过
//        if (!(handler instanceof HandlerMethod)) {
//            return true;
//        }
//
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//        Method method = handlerMethod.getMethod();
//        String requestPath = request.getRequestURI();
//        logger.debug(String.format("ip: %s, path: %s, Method: %s, IgnoreSecurity: %s",
//                request.getLocalAddr(), requestPath, method.getName(),
//                method.isAnnotationPresent(IgnoreSecurity.class)));
//
//        if (method.isAnnotationPresent(IgnoreSecurity.class)) {
//            return true;
//        }
//
//        String token = request.getHeader("ACCESS_TOKEN");
//        logger.debug("token: " + token);
//
//        if (StringUtils.isNullOrEmpty(token)) {
//            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        }
//
//        UserBean userBean = userService.getLoginUser(request,token);
//        request.setAttribute("currentUser", userBean);
//
//        if (userBean == null) {
//            response.setCharacterEncoding("UTF-8");
//            response.setHeader("Access-Control-Allow-Credentials", "true");
//            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//            response.setHeader("Content-Type", "application/json");
//            response.getWriter().append(JSON.toJSONString(ResultBean.failure("用户登录 过期了", ResultBean.ERROR_TOKEN_EXPIRE, null)));
//            return false;
//        }
        return true;
    }
}