cd # CLIPS4Android

CLIPS4Android is a library that provides CLIPS (C Language Integrated Production System) functionality for Android applications.

## Project Structure

- **ClipsAndroid**: The core library that provides CLIPS functionality
- **examples**: Example applications demonstrating how to use the CLIPS4Android library
  - **SimpleDemo**: A simple demo showing basic CLIPS functionality
  - **AnimalDemo**: A more complex demo implementing an expert system for animal identification

## Requirements

- Android Studio 4.0 or higher
- Android SDK 21 or higher
- Gradle 8.0 or higher
- JDK 8 or higher

## Building the Project

1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Build the project

Alternatively, you can build the project from the command line:

```bash
cd CLIPS4Android
./gradlew build
```

## Running the Examples

### SimpleDemo

The SimpleDemo app demonstrates basic CLIPS functionality:
- Loading CLIPS rules
- Asserting facts
- Evaluating expressions
- Handling errors

To run the SimpleDemo app:

1. Open the project in Android Studio
2. Select the SimpleDemo configuration
3. Run the app on an emulator or device

### AnimalDemo

The AnimalDemo app implements an expert system for animal identification:
- Uses CLIPS rules to identify animals based on user responses
- Demonstrates a more complex use case for CLIPS

To run the AnimalDemo app:

1. Open the project in Android Studio
2. Select the AnimalDemo configuration
3. Run the app on an emulator or device

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.