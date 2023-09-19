package mirrormasters;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("MTE1MTYxMjYwOTgwNDYzMjE3NQ.Gqvenn.tCWmlQpAys1Oa6pq2n1GgbUwJQLJTo0vCPD2mM")
                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        jda.addEventListener(new listeners());

    }
}
