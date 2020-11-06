package com.example.gpaas;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

/**
 *
 */
@RestController
@RequiredArgsConstructor
public class TestController {

  private final SearchTermRepo searchTermRepo;

  @GetMapping("/search-terms")
  public List<SearchTerm> getProducts() {
    return searchTermRepo.findAll();
  }


}
