package in.stackroute.ust.Controllers;


import in.stackroute.ust.Domain.Arithmetic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/add/{a}/{b}")
    public Arithmetic Add(@PathVariable int a, @PathVariable int b) {
        return new Arithmetic(a, b, a + b, "+");
    }

    @GetMapping("/sub/{a}/{b}")
    public Arithmetic Sub(@PathVariable int a, @PathVariable int b) {
        return new Arithmetic(a, b, a - b, "-");
    }

    @GetMapping("/mul/{a}/{b}")
    public Arithmetic Mul(@PathVariable int a, @PathVariable int b) {
        return new Arithmetic(a, b, a * b, "*");
    }

    @GetMapping("/div/{a}/{b}")
    public Arithmetic Div(@PathVariable int a, @PathVariable int b) {
        return new Arithmetic(a, b, b / a, "/");
    }
}
