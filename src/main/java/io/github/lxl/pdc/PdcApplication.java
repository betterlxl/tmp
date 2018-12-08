package io.github.lxl.pdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("io.github.lxl.pdc.mapper")
@ComponentScan("io.github.lxl.pdc")
@EnableTransactionManagement
@SpringBootApplication
public class PdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdcApplication.class, args);
	}
}
