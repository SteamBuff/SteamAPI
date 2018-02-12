package org.steambuff;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceHelper {


    public static String getJSON(String name) {
        ClassLoader classLoader = ResourceHelper.class.getClassLoader();
        File file = new File(classLoader.getResource(name + ".json").getFile());
        try {
            return new String(Files.readAllBytes(Paths.get(file.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.toString();
    }
}
