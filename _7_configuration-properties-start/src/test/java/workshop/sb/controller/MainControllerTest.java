package workshop.sb.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"foo=FooProp",
        "bar=BarProp",
        "x=XProp"})
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Environment environment;

    @Test
    public void getFoo() throws Exception {
        this.mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("foo")));
    }

    @Test
    public void getBar() {

    }

    @Test
    public void getX() {

    }
}