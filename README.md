# Savings Application

This JavaFX application provides a simple interface to visualize savings growth over time based on monthly savings and yearly interest rate. It includes sliders to adjust these values and updates a line chart to reflect the savings projection.

## Features

- **Monthly Savings Slider:** Allows users to adjust the monthly savings amount. The value ranges from 25 to 250.
- **Yearly Interest Rate Slider:** Allows users to adjust the yearly interest rate. The value ranges from 0% to 10%.
- **Line Chart Visualization:** Displays the projected savings over a 30-year period, both with and without interest.

## Requirements

- Java Development Kit (JDK) 8 or higher
- JavaFX SDK

## Installation

1. Ensure you have the JDK and JavaFX SDK installed on your system.
2. Clone the repository or download the source code.
3. Open the project in your preferred IDE (such as IntelliJ IDEA, Eclipse, or NetBeans).

## Usage

1. Compile and run the application. You can run the `App` class directly from your IDE or use the following command in the terminal:

   ```sh
   javac savings/application/App.java
   java savings.application.App
   ```

2. The application window will display a line chart and two sliders.
3. Adjust the "Monthly savings" slider to change the monthly savings amount.
4. Adjust the "Yearly interest rate" slider to change the yearly interest rate.
5. The line chart will update automatically to reflect the changes in savings over a 30-year period.

## Code Overview

- **Class:** `App` (extends `Application`)
  - **Method:** `start(Stage window)`
    - Initializes the main components of the application.
    - Creates a line chart to display the savings projection.
    - Adds sliders for monthly savings and yearly interest rate.
    - Updates the line chart based on the values of the sliders.
  - **Method:** `main(String[] args)`
    - Launches the application.

## Contributing

If you have any suggestions or improvements, feel free to create a pull request or open an issue.

## Contact

For any questions or inquiries, please contact [@hastycodeandreh@gmail.com].

---

