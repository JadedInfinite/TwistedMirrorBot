package mirrormasters.rules;

public class spell {
    String name;
    String element;
    String notation;
    String description;
    int cooldown;
    int levelLim;
    enum category{
        SPECIAL,
        PHYSICAL,
        STATUS
    }
    enum range{
        CLOSE,
        MID,
        LONG,
        RANDOM,
        ALL
    }
    enum target{
        SINGLE,
        MULTIPLE,
        AOE,
        AOE_FOE,
        PIERCE,
        EVERYTHING,
        WEATHER,
        SELF,
        ALLIES
    }

    category spellType;
    range distance;
    target victimType;

    spell(){

    }

    spell(String name, String x, String y, String z,
          String diceNotation, int cooldown, int levelLim,
          String description){
        this.name = name;
        this.spellType = category.valueOf(x);
        this.distance = range.valueOf(y);
        this.victimType = target.valueOf(z);
        this.notation = diceNotation;
        this.cooldown = cooldown;
        this.levelLim = levelLim;
        this.description = description;
    }

}
