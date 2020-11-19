//package com.ghac.myspilder.myspilder3.exception;
//
///**
// * @author Z
// * @date 2019/4/3
// */
//
//import com.sasa.AppResponse;
//import com.sasa.exception.GlobalException;
//import com.sasai.wallet.utils.LanguageUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
///**
// * 该注解会 适用所有的@RequestMapper() 结合@ExceptionHander 实现全局异常处理
// */
//@ControllerAdvice
//@ResponseBody
//public class GlobalExceptionHandler {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
//
//    @ExceptionHandler(value = Exception.class) /*定义拦截 异常的范围 此时 是拦截所有异常*/
//    public AppResponse exceptionHandler(HttpServletRequest request, Exception e) {
//        LOGGER.warn("错误的类型是" + e);
//        if (e instanceof GlobalException) {
//            GlobalException globalException = (GlobalException) e;
//            return AppResponse.error(globalException.getErrCode(),globalException.getErrMsg());
//        } else if (e instanceof MethodArgumentNotValidException) {
//            /*注意：MethodArgumentNotValidException 是 Spring 框架抛出的Validation异常*/
//            MethodArgumentNotValidException ex = (MethodArgumentNotValidException) e;
//            BindingResult bindingResult = ex.getBindingResult();/*抛出异常可能不止一个 输出为一个List集合*/
//            List<ObjectError> errorList = bindingResult.getAllErrors();
//            ObjectError error = errorList.get(0);/*取第一个异常*/
//            String errorMsg = error.getDefaultMessage(); /*获取异常信息*/
//            return AppResponse.error(errorMsg);
//        } else {
//            e.printStackTrace();
//            return AppResponse.error(LanguageUtils.getInstance().getLanguage("5001"));
//        }
//
//
//    }
//
//}
