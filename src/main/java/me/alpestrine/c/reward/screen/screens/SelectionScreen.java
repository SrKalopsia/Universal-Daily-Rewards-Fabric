package me.alpestrine.c.reward.screen.screens;

import me.alpestrine.c.reward.screen.button.ItemBuilder;
import me.alpestrine.c.reward.screen.screens.reward.DailyScreen;
import me.alpestrine.c.reward.screen.screens.reward.PlaytimeScreen;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class SelectionScreen extends AbstractACScreen {
    @Override
    public void addButtons(ServerPlayerEntity viewer) {
        setButton(11, ItemBuilder.start(DailyScreen.dailyItem)
                .name(Text.translatable("gui.rewards.selection.daily"))
                .button(event -> event.player.openHandledScreen(new DailyScreen())));
        setButton(15, ItemBuilder.start(PlaytimeScreen.playtimeItem)
                .name(Text.translatable("gui.rewards.selection.playtime"))
                .button(event -> event.player.openHandledScreen(new PlaytimeScreen())));
    }

    @Override
    public Text getName() {
        return Text.translatable("gui.rewards.selection.title");
    }

    @Override
    public int getPage() {
        return 1;
    }
}