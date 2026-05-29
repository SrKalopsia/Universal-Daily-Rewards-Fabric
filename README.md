# Daily Rewards Fabric
A simple fabric mod made for small-medium servers to give their members an incentive to join the server and keep playing. 

Commands: 
/rewards-reload-daily-config
/rewards-reload-global-config
/rewards-reload-playerdata-config
/rewards-reload-playtime-config
/rewards-screen-entity add|remove <entity uuid> - Assign the menu to an entity so that when clicked, it'd open the GUI.

Contributions are appreciated, as there are many bugs.
Known ones:
- Members get daily rewards for days they didn't log on on.
- A console error comes in every now in then in server console:

Error:
[20:56:12] [Server thread/INFO]: [STDERR]: java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 63

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/java.util.Objects.checkIndex(Objects.java:365)

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/java.util.ArrayList.get(ArrayList.java:428)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_2371.get(class_2371.java:47)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//me.alpestrine.c.reward.server.MainServer.handleClick(MainServer.java:56)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1703.handler$cnm000$rewards$onClick(class_1703.java:4373)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1703.method_30010(class_1703.java)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1703.method_7593(class_1703.java:294)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_3244.method_12076(class_3244.java:1722)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_2813.method_12191(class_2813.java:71)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_2813.method_11054(class_2813.java:14)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_2600.method_11072(class_2600.java:27)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_3738.run(class_3738.java:18)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1255.method_18859(class_1255.java:162)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_4093.method_18859(class_4093.java:23)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_24306(MinecraftServer.java:864)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_18859(MinecraftServer.java:173)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1255.method_16075(class_1255.java:136)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_20415(MinecraftServer.java:846)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_16075(MinecraftServer.java:840)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.class_1255.method_5383(class_1255.java:121)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_16208(MinecraftServer.java:814)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_29741(MinecraftServer.java:702)

[20:56:12] [Server thread/INFO]: [STDERR]:      at knot//net.minecraft.server.MinecraftServer.method_29739(MinecraftServer.java:281)

[20:56:12] [Server thread/INFO]: [STDERR]:      at java.base/java.lang.Thread.run(Thread.java:1570)
