# About
This is Weather App. It stores information about weather and temperature of location at particular day. It is made using 2 kind of design patterns:
- **Chain of Responsibility** is one of behavioral pattern. It can be used to replace handling conditions by using switch-case. Instead of having long list of switch-case flow, this pattern encourage creating different handlers and chain them to handle different conditions. This pattern is implemented in creating the input handler.
- **Composite** is one of structural pattern. It can be used to create recursive structure of components. This pattern is implemented to create the data structure of weather data.

# How to Use
You can give 3 types of input:
1. `location <name_of_place>` will output weather data of the given place.
2. `Q` for Quit.

# Development Setup
- Kotlin compiler version **1.3.31** to build the source code.
- JDK version **12.0.1** to run the jar.

# Build and Run
Script for building and running have already provided in this project.
- To build: `./build`
- To run: `./run`
