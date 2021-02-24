//package com.atguigu.easyexcel.inter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class WebMvcConfigExt extends WebMvcConfig {
//
//    /**
//     * 防止重复提交拦截器
//     */
//    @Autowired
//    private SameUrlDataInterceptor sameUrlDataInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 避开静态资源
//        List<String> resourcePaths = defineResourcePaths();
//        registry.addInterceptor(sameUrlDataInterceptor).addPathPatterns("/**").excludePathPatterns(resourcePaths);// 重复请求
//    }
//
//    /**
//     * 自定义静态资源路径
//     *
//     * @return
//     */
//    @Override
//    public List<String> defineResourcePaths() {
//        List<String> patterns = new ArrayList<>();
//        patterns.add("/assets/**");
//        patterns.add("/upload/**");
//        patterns.add("/static/**");
//        patterns.add("/common/**");
//        patterns.add("/error");
//        return patterns;
//    }
//}