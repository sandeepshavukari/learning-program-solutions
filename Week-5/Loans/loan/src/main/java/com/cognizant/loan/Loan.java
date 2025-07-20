package com.cognizant.loan;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")

public class Loan {
	  @GetMapping("/{number}")
	    public Map<String, Object> getLoanDetails(@PathVariable String number) {
	        return Map.of(
	            "number", number,
	            "type", "car",
	            "loan", 400000,
	            "emi", 3258,
	            "tenure", 18
	        );
	    }

}