import jakarta.servlet.*;

import java.io.IOException;

public class myFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-- filter doFilter() --");

        //request filter
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-- filter init() --");
    }

    @Override
    public void destroy() {
        System.out.println("-- filter destroy() --");
    }
}
