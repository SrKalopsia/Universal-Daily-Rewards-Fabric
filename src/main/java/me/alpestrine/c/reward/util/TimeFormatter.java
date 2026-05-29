package me.alpestrine.c.reward.util;

public interface TimeFormatter {
    static String format(int minutes) {
        int hours = minutes / 60;
        minutes = (int) Math.floor(minutes % 60D);
        String format = "";
        format += hours > 0 ? String.format("%s hora".concat(hours > 1 ? "s" : ""), hours) : "";
        if (!format.isEmpty()) {
            format += ", ";
        }
        format += String.format("%s minuto".concat(minutes > 1 || minutes == 0 ? "s" : ""), minutes);
        return format;
    }
}