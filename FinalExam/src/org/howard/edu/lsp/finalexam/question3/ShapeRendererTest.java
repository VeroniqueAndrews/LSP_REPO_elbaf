package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test class for ShapeRenderer and ShapeFactory.
 */
public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("circle"));
    }

    @Test
    public void testRenderRectangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("rectangle"));
    }

    @Test
    public void testRenderTriangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("triangle"));
    }

    @Test
    public void testUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();

        // Test for unknown shape
        Exception exception = assertThrows(IllegalArgumentException.class, () -> renderer.renderShape("hexagon"));
        assertEquals("Unknown shape type: hexagon", exception.getMessage());

        // Test for another unknown shape
        exception = assertThrows(IllegalArgumentException.class, () -> renderer.renderShape("pentagon"));
        assertEquals("Unknown shape type: pentagon", exception.getMessage());
    }

    @Test
    public void testNullShapeType() {
        ShapeRenderer renderer = new ShapeRenderer();

        // Test for null input
        Exception exception = assertThrows(IllegalArgumentException.class, () -> renderer.renderShape(null));
        assertEquals("Shape type cannot be empty", exception.getMessage());
    }

    @Test
    public void testEmptyShapeType() {
        ShapeRenderer renderer = new ShapeRenderer();

        // Test for empty string input
        Exception exception = assertThrows(IllegalArgumentException.class, () -> renderer.renderShape(""));
        assertEquals("Shape type cannot be null or empty", exception.getMessage());
    }
}
