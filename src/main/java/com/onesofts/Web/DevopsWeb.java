package com.onesofts.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsWeb {
@GetMapping("dev")
public String getData() {
    return "i am sandhya";
}

}
