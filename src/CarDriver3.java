import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class CarDriver3 extends Application {
    public void start(Stage primaryStage) {
        TextInputDialog input = new TextInputDialog();
        Alert output = new Alert(Alert.AlertType.INFORMATION);

        input.setHeaderText("Create your garage!");
        input.setContentText("Please enter a number for the amount of cars you want in your garage");
        input.showAndWait();
        int numCompare;
        int numCars = Integer.parseInt(input.getResult());
        Cars3[] car = new Cars3[(numCars)];
        int carNum = 0;

        for (int count = 1; count <= numCars; count++) {

            input.setHeaderText("Color");
            input.setContentText("Enter the color for car " + count);
            input.showAndWait();
            String color = input.getResult();

            input.setHeaderText( " Horsepower");
            input.setContentText(" enter the horsepower for car " + count);
            input.showAndWait();
            int horsepower = Integer.parseInt(input.getResult());

            input.setHeaderText( "Engine Size");
            input.setContentText("Enter the engine size for car " + count);
            input.showAndWait();
            double enginesize = Double.parseDouble(input.getResult());

            input.setHeaderText(" Make");
            input.setContentText("Enter the make for car " + count);
            input.showAndWait();
            String make = input.getResult();

            car[carNum] = new Cars3(color, horsepower, enginesize, make);

            output.setContentText(carNum + " " + car[carNum]);
            output.showAndWait();
            carNum++;

        }

        input.setHeaderText("Enter two cars to compare");
        input.setContentText("Enter car numberfor the first car");
        input.showAndWait();
        numCompare = Integer.parseInt(input.getResult()) - 1;
        input.setHeaderText("Enter two cars to compare");
        input.setContentText(" Enter car number for the secound car");
        input.showAndWait();
        output.setHeaderText(" Are the two cars equal?");
        output.setContentText("" + car[numCompare].equals(car[Integer.parseInt(input.getResult()) - 1]));

        output.showAndWait();
    }

}



