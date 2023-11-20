package net.runelite.client.plugins.leftclickblackjack;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("leftClickBlackjack")
public interface LeftClickBlackjackConfig extends Config
{
    @ConfigSection(
            name = "Config",
            description = "",
            position = 0
    )
    String config = "Config";

    @ConfigItem(
            keyName = "pickpocketOnAggro",
            name = "Pickpocket when aggro'd",
            section = config,
            description = "Switches to \"Pickpocket\" when bandit is aggro'd. Saves food at the cost of slight xp/h.",
            position = 0
    )
    default boolean pickpocketOnAggro()
    {
        return false;
    }

    @ConfigItem(
            keyName = "random",
            name = "Randomly Miss 1 Pickpocket",
            section = config,
            description = "If enabled, this will randomly miss 1 pickpocket every so often." +
                    "<br> Not sure why'd you want to do that, but you can.",
            position = 1
    )
    default boolean random()
    {
        return false;
    }
}
