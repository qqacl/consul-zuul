package com.wyy.api;

import org.springframework.stereotype.Component;

@Component //@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
public class TestFallBackFactory implements TestApi {

    @Override
    public String test01(String name) {
        return "出错啦...";
    }

}
