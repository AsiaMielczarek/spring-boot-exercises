package workshop.sb.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


// TODO 1 dodaj adnotację @WebMvcTest (kontroler nie ma wstrzykiwanych żadnych zależności)

@RunWith(SpringRunner.class)
// jeśli w controllerze nic nie wstrzykujemy >
@WebMvcTest
public class CalculatorApplicationTests {

    // TODO 2 wstrzyknij MockMvc
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/add/2/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("5.0")));

    }

    @Test
    public void shouldSubstract() throws Exception {
        this.mockMvc.perform(get("/sub/2/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("-1.0")));
    }

    @Test
    public void shouldMultiply() throws Exception {
        this.mockMvc.perform(get("/multi?a=2&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("6.0")));
    }

    @Test
    public void shouldDivide() throws Exception {
        this.mockMvc.perform(get("/div?a=2&b=1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("2.0")));
    }
}
