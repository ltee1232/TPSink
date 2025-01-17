import java.awt.*;
import java.io.File;

/**
 * A representation of a {@link Appliance} object including a name and other optional fields.
 * @author Jasper Newkirk
 * @version 1.0.0
 */
public class Appliance {
    /**
     * The name of the current {@link Appliance}.
     */
    private final String name;
    /**
     * The dimensions of the current {@link Appliance}.
     */
    private final Dimension dimensions;
    /**
     * The description of the current {@link Appliance}.
     */
    private final String description;

    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     */
    public Appliance(String name, String path) {
        this(name, path, null, "");
    }
    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     * @param dimensions The dimensions of this room.
     */
    public Appliance(String name, String path, Dimension dimensions) {
        this(name, path, dimensions, "");
    }
    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     * @param description The description of the current {@link Appliance}.
     */
    public Appliance(String name, String path, String description) {
        this(name, path, null, description);
    }

    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     * @param dimensions The dimensions of the current {@link Appliance}.
     * @param description The description of the current {@link Appliance}.
     */
    public Appliance(String name, String path, Dimension dimensions, String description) {
        // TODO: Test this
        File room = new File(path + "\\" + name);
        int i = 1;
        while (!room.mkdir()) {
            room = new File(path + "\\" + name + "(" + i++ + ")");
        }
        name += "(" + i + ")";
        this.name = name;
        this.dimensions = dimensions;
        this.description = description;
    }
}
