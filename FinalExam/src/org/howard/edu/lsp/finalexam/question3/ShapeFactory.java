package org.howard.edu.lsp.finalexam.question3;

/**
 * Singleton factory for creating Shape objects.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor for Singleton
    private ShapeFactory() {}

    /**
     * Retrieves the Singleton instance of ShapeFactory.
     * 
     * @return the Singleton instance
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a shape based on the provided type.
     * 
     * @param shapeType the type of shape (e.g., "circle", "rectangle", "triangle")
     * @return the created Shape object
     * @throws IllegalArgumentException if the shapeType is invalid
     */
    public Shape createShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            throw new IllegalArgumentException("Shape type cannot be null or empty");
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
