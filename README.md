# Universal Daily Rewards

![Version](https://img.shields.io/badge/version-4.0.0-blue.svg) ![Minecraft](https://img.shields.io/badge/minecraft-1.21.1-green.svg) ![License](https://img.shields.io/badge/license-MIT-yellow.svg) ![Platform](https://img.shields.io/badge/platform-Fabric-orange.svg)

This release marks a complete evolution and total overhaul from the original `daily-rewards-fabric` mod. Formerly known as Cobbleverse Daily Rewards, version 4.0.0 introduces a universal architecture designed for any Minecraft server.

[![Download on Modrinth](https://img.shields.io/badge/Download-Modrinth-1bd96a.svg)](https://modrinth.com/mod/cobbleverse-daily-rewards) [![GitHub](https://img.shields.io/badge/GitHub-Source-black.svg)](https://github.com/SrKalopsia/cobbleverse-daily-rewards-fabric)

**Universal Daily Rewards** is a 100% standalone, server-side mod that provides a highly configurable rewards system with native localization and a powerful template engine.

📖 **[Click here to read the full CHANGELOG](CHANGELOG.md)**

### ✨ Key Features (v4.0.0+)

* 🚀 **100% Server-Side:** No client-side installation required. Powered by **Polymer**.
* 🌍 **Native Localization (i18n):** Automatically adapts to the player's client language using **Server Translations API**.
* 📋 **Template System:** Quickly switch between pre-configured reward sets (Vanilla, Economy, Cobbleverse) using the `/rewards-setup load` command.
* 🔄 **Looping Streaks:** Configure your daily rewards once and let them cycle automatically.
* 🕒 **Dynamic Cooldowns:** Real-time "Available in: Xh Ym" timers in GUI tooltips.
* 🖥️ **Remote Access:** Players can open the rewards menu using `/daily` (configurable in `global.json`).
* ⚙️ **Universal i18n Templates:** Default templates now use Minecraft `translate` keys, ensuring rewards names are localized in the player's language.

### 🛠️ Commands

#### Player Commands
* `/daily` - Opens the rewards selection menu (if enabled in config).
* `/rewards open` - Alias for `/daily`.

#### Admin Commands (Permission Level 2+)
* `/rewards-reload-<type>-config` - Hot-reload specific configurations.
* `/rewards-reset <player>` - Reset all progress for a player.
* `/rewards-setstreak <player> <days>` - Adjust daily login streak.
* `/rewards-setplaytime <player> <seconds>` - Adjust tracked playtime.
* `/rewards-screen-entity <add|remove> <entity>` - Bind the menu to physical NPCs.

#### Setup Commands (Permission Level 4)
* `/rewards-setup load <template>` - Apply a pre-made template (`vanilla`, `economy`, `cobbleverse`).

## ⚙️ Configuration Example
The mod uses an intuitive JSON structure. Here is a sample of how a daily reward is configured:

```json
[
  {
    "day": 1,
    "id": "day_1",
    "commands": [
      "give %player% minecraft:diamond 1"
    ],
    "items": [
      {
        "item": "minecraft:diamond",
        "name": "{\"translate\":\"item.minecraft.diamond\",\"color\":\"aqua\",\"bold\":true}",
        "amount": 1,
        "give_item": false
      }
    ]
  }
]
```

## 📜 Credits

This project is an overhauled fork of the original [Daily-Rewards-Fabric](https://github.com/SmugTheKiler/daily-rewards-fabric) by SmugTheKiler. Huge thanks to them for laying the foundation!
