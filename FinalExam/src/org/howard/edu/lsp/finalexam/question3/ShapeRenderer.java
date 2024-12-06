package org.howard.edu.lsp.finalexam.question3;

/**
 * Class for rendering shapes using the ShapeFactory.
 */
public class ShapeRenderer {
    /**
     * Renders a shape of the specified type.
     * 
     * @param shapeType the type of shape to render
     */
    public void renderShape(String shapeType) {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape(shapeType);
        shape.draw();
    }
}
