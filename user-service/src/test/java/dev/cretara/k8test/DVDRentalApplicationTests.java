package dev.cretara.k8test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DVDRentalApplicationTests {

    @Test
    void contextLoads() {
        Integer integer = 1;
        assertThat(integer).isPositive();
    }

}
