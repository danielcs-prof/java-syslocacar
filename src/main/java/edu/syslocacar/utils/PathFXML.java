package edu.syslocacar.utils;

import java.nio.file.Paths;

public class PathFXML {

    public static String pathBase() {
        return Paths.get("src/main/java/edu/syslocacar/view").toAbsolutePath().toString();
    }
}
