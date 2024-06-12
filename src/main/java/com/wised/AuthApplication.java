package com.wised;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.wised.auth.repository", "com.wised.helpandsettings.repository", "com.wised.post.repository", "com.wised.people.repository"})
@ComponentScan(basePackages = {"com.wised.auth", "com.wised.helpandsettings", "com.wised.post", "com.wised.people", "com.wised.bystream"})
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}

//echo "# actions-github" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/pankaj-wised/actions-github.git
//git push -u origin main