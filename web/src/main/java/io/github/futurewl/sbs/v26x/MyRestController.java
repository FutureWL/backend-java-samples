package io.github.futurewl.sbs.v26x;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myrest")
public class MyRestController {


    @GetMapping("/myget")
    public String myget() {
        return "myget";
    }

    @GetMapping("/mygetparam")
    public String myget(String myparam) {
        return "myget param:" + myparam;
    }

    @GetMapping("/getPerson")
    public String getPerson() {
        return new Person("小明", 18).toString();
    }

    @PostMapping("/postPerson")
    public String postPerson(@RequestBody Person person) {
        return person.toString();
    }

    @PutMapping("/putPerson")
    public String putPerson(@RequestBody Person person) {
        return person.toString();
    }
}
