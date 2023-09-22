package mirrormasters.rules;

public class rules {
    public enum elements{
        FIRE,
        TECH,
        MELEE,
        BEAST,
        ELECTRIC,
        LIGHT,
        ARBOR,
        WATER,
        ICE,
        AIR,
        POISON,
        PSYCHIC,
        METAL,
        SPIRIT,
        EARTH,
        SOUND,
        DARK
    }

    public int matchup(String x,boolean y){
        switch (x) {
            case ("FIRE"):
                return 1;
        }
        return 1;
    }
}
