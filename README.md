# BMI Calculator

This is a simple BMI (Body Mass Index) calculator built using JavaFX. The application allows the user to input their weight and height, choose between metric and imperial units, and calculate their BMI. It also provides the user with a simple help window and the option to clear input fields and exit the application.

## Features

- Calculate BMI based on weight and height.
- Switch between metric (kg/m) and imperial (lb/in) units.
- Display BMI categories (Underweight, Normal, Overweight, Obese) with corresponding color coding.
- Clear input fields with a "Clear" button.
- Exit the application with an "Exit" button.
- Access instructions via a "Help" button that opens a new window.

## Getting Started

1. **Clone the repository** or download the project files:
   ```bash
   git clone https://github.com/your-repository/bmi-calculator.git
   ```

2. **Set up the project in your IDE** (such as IntelliJ IDEA or Eclipse):
   - Open the project in your IDE.
   - Ensure that the JavaFX SDK is properly configured in your project.
   - Link the FXML files in your project (make sure `bmi_calculator.fxml` and `help.fxml` are correctly loaded).

3. **Run the application** by executing the `Main` class.

## Application Workflow

1. **Enter Weight and Height**:
   - Enter your weight in kilograms or pounds (depending on the unit switcher).
   - Enter your height in meters or inches.

2. **Switch Between Metric and Imperial Units**:
   - By default, the application uses metric units (kg/m).
   - Select the unit switcher to use imperial units (lb/in).

3. **Calculate BMI**:
   - Click the "Calculate BMI" button.
   - Your BMI will be displayed in the `resultLabel` field.
   - The `BMIValueLabel` will show a category (Underweight, Normal, Overweight, or Obese) with a corresponding background color.

4. **Clear Input Fields**:
   - Click the "Clear" button to reset the weight, height, and result fields.

5. **Help Window**:
   - Click the "Help" button in the menu to open a new window with instructions on how to use the application.

6. **Exit the Application**:
   - Click the "Exit" button in the menu to close the application.

## Screenshots

- **Main Window**: Displays the input fields for weight, height, and the unit switcher, along with the buttons for calculating BMI, clearing inputs, and exiting the application.

  ![Screenshot 2024-10-14 235426](https://github.com/user-attachments/assets/27af39f4-5dfe-4f4f-827d-fbf48761cef0)
  
- **Help Window**: Opens a simple window with instructions on how to use the application.

  ![Screenshot 2024-10-14 235632](https://github.com/user-attachments/assets/24728429-7e22-4c0c-a6a8-05cae57d1b5c)

## Examples of usage

![Screenshot 2024-10-14 235806](https://github.com/user-attachments/assets/39ba8f3d-c14f-41c8-9ed4-6b77eb56f450)

![Screenshot 2024-10-14 235730](https://github.com/user-attachments/assets/af96afa6-7e8f-4da3-aeb2-e391ed26d35e)

![Screenshot 2024-10-14 235920](https://github.com/user-attachments/assets/395e02b8-c0c7-4275-b530-b26c55e7cedf)
