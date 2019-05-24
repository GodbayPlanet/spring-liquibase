package nma.spring.liquibase.rest;

import static nma.spring.liquibase.entities.User.Authority.ADMIN;
import static nma.spring.liquibase.entities.User.Authority.USER;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import nma.spring.liquibase.entities.User;
import nma.spring.liquibase.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    @DisplayName("Should result in 200")
    public void testGetUsers() throws Exception {
        final int USERS_LIST_SIZE = 2;
        when(userService.getUsers()).thenReturn(getUsers());

        mockMvc.perform(get("/")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.length()").value(USERS_LIST_SIZE));
    }

    private List<User> getUsers() {
        return Arrays.asList(
            User.builder()
                .id(1)
                .firstName("Pero")
                .lastName("Peric")
                .email("pero@gmail.com")
                .password("password_pero")
                .authority(ADMIN)
                .build(),
            User.builder()
                .id(1)
                .firstName("Jelena")
                .lastName("Jelic")
                .email("jelena@gmail.com")
                .password("password_jelena")
                .authority(USER)
                .build()
        );
    }
}