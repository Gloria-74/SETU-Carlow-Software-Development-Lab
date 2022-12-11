from ursina import *
# ursina = Library for gaming surface

from ursina.prefabs.first_person_controller import FirstPersonController 
# to import the player from the library to be able to move

app = Ursina()

player = FirstPersonController()

boxes = []

Sky()

def random_color():
    red = random.Random().random() * 255 # generates a random color
    green = random.Random().random() * 255
    blue = random.Random().random() * 255
    return color.rgb(red, green, blue)

def add_box(position):
    boxes.append(
        Button (
            parent = scene,
            model = 'cube', 
            origin = 0.5, 
            color = random_color(),
            position = position,
            texture = 'grass'
        )
    )

# model to make a cube
# origing = how far the cube is away from the player
# color = color.blue to get all cubes blue
# random_color to generate random rgb colors

for x in range(20):
    for y in range(20):
        add_box((x, 0, y)) # vector coordinates

def input(key):
    for box in boxes:
        if box.hovered:
            if key == "left mouse down":
                # add new cube
                add_box(box.position + mouse.normal)
            if key == "right mouse down":
                boxes.remove(box)
                destroy(box)

# mouse.normal to add a new box above/ beside a box
# left mouse down = when left mouse is pressed
# right mouse down = when right mouse is pressed
# .remove to remove something from the array
# destroy to remove it from the world

app.run() 
# python minecraft.py to run the game
# alt + f4 to close the game
