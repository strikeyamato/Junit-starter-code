import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @org.junit.jupiter.api.Test
    void getHelloWorld() {
        GreetingService greetingService = new GreetingService();

        // Act
        String result = greetingService.getHelloWorld();

        // Assert
        assertEquals("Hello, World!", result);
    }

    @org.junit.jupiter.api.Test
    void getHelloUniverse() {
        // Arrange
        GreetingService greetingService = new GreetingService();

        // Act
        String result = greetingService.getHelloUniverse();

        // Assert
        assertEquals("Hello, Universe!", result);
    }
}