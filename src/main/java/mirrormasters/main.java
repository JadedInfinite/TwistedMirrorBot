package mirrormasters;

import mirrormasters.commands.Vibe;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("")
                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        jda.addEventListener(new listeners());
        jda.addEventListener(new Vibe());


    }
}
