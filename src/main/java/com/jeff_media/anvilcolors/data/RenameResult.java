package com.jeff_media.anvilcolors.data;

public class RenameResult {
    public String getColoredName() {
        return coloredName;
    }

    public int getReplacedColorsCount() {
        return replacedColorsCount;
    }

    private final String coloredName;
    private final int replacedColorsCount;

    public RenameResult(String coloredName, int replacedColorsCount) {
        this.coloredName = coloredName;
        this.replacedColorsCount = replacedColorsCount;
    }
}
