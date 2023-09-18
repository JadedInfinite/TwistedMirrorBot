package mirrormasters;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("MTE1MTYxMjYwOTgwNDYzMjE3NQ.G1zgi8.3uZHmwjxACCcx9-vUlfcWV5X-EbcKbGHUmsFAs").build();
        jda.addEventListener(new listeners());
    }
}
