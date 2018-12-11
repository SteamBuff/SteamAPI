package org.steambuff;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * The type Resource helper.
 */
public class ResourceHelper {


    /**
     * Gets json.
     *
     * @param name the name
     * @return the json
     */
    static String getJSON(String name) {
        ClassLoader classLoader = ResourceHelper.class.getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(name + ".json")).getFile());
        try {
            return new String(Files.readAllBytes(Paths.get(file.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.toString();
    }
}
