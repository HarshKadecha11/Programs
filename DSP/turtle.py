# Import the turtle module
import turtle

# Create a screen
screen = turtle.Screen()
screen.title("Turtle Example")

# Create a turtle named "artist"
artist = turtle.Turtle()
artist.speed(1)  # Set the drawing speed

# Draw a square
for _ in range(4):
    artist.forward(100)  # Move forward 100 units
    artist.right(90)  # Turn right by 90 degrees

# Close the window on a click
screen.exitonclick()

