Coded on intellij ..

This will be a project to automate the best crafting options given parameters and items.

Initially it will be coded for The Legend Of Zelda: Breath Of The Wild

Data will be taken from https://rankedboost.com/zelda-breath-of-the-wild/crafting-materials/

Design :
    -must be modular so that it can possibly be used for other games

Execution :
    Break it into the following classes.
        -materials(base)
        -combinations(the way to create output)
        -outputMaterials(crafted materials)

-materials needs to store all materials from the game in a database/spreadsheet they need to be read in and separated
into individual objects. Do not want to be reading them in and sorting text-wise as this code may be useful in other
games at a later time.

-combinations cab be a class that takes materials as inputs and outputs crafted ones?? based on parameters

-outputMaterials may be the same class as materials, this makes more sense seeing as crafted materials may be
components of larger materials. e.g. fire + stone = fire arrow fire arrow + lightning = WMD

1) gain database of the materials
2) read them in and separate them into objects with classes
3) todo...

materials table
type table?

Composite design for the base, crafted material relationship not done because it is needed, done so that in
situation that this is ever used in other project with more materials can still be treated as just materials.

need an interface for materials (components)
need a base class for non crafted materials (leaf)
need a crafted class for other materials (composite)

commands that can be called on all??

