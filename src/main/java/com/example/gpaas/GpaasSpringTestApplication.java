package com.example.gpaas;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class GpaasSpringTestApplication {

  private final SearchTermRepo searchTermRepo;

  public static void main(final String[] args) {
    SpringApplication.run(GpaasSpringTestApplication.class, args);
  }

  @PostConstruct
  public void init() {
    searchTermRepo.save(new SearchTerm(1, "laptop"));
    searchTermRepo.save(new SearchTerm(2, "computer"));
    searchTermRepo.save(new SearchTerm(3, "linen"));
    searchTermRepo.save(new SearchTerm(4, "laundry"));
    searchTermRepo.save(new SearchTerm(5, "legal"));
    searchTermRepo.save(new SearchTerm(6, "stuff"));
  }

}
