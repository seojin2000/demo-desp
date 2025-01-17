package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // MVC 테스트 -> 목업통해서 가상 처리 가능
        // RestAPI 테스트 가능
        // 메세지가 보이진 않음
        System.out.println("단위 텍스트 호출||echo");
    }

}
