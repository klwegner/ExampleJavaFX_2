package example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();

        pane.setTop(getTitleVBox());
        pane.setCenter(getVBox());
        pane.setBottom(new CustomPane("Note: I actually do like camping, even if I am bad at it."));    
        BorderPane.setAlignment(pane, Pos.BASELINE_CENTER);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Camping Time!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private HBox getHBox1(){
        HBox hbox = new HBox (15);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.getChildren().add(new Button("Nighttime Temperatures Over 80"));
        hbox.getChildren().add(new Button("Extra Modly Tent"));
        hbox.getChildren().add(new Button("Arrive thirty minutes to close"));
        hbox.getChildren().add(new Button("Endure one and four year-olds crying loudly; attempt to soothe them repeatedly"));

        return hbox;
    }

    private HBox getHBox2(){
        HBox hbox = new HBox (15);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.getChildren().add(new Button("Wait for dawn, only to be eaten alive by no-see-ums while trying to escape and decommission biohazard tent"));
        hbox.getChildren().add(new Button("Struggle to get children to eat provided food"));
        hbox.getChildren().add(new Button("Experience total nasal congestion, necessitating mouth-breathing"));
        hbox.getChildren().add(new Button("Enjoy crisp and cool swimming in a somewhat crowded spring"));

        return hbox;
    }

    private HBox getHBox3(){
        HBox hbox = new HBox(15);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.getChildren().add(new Button("See a hawk at the neighboring campsite"));
        hbox.getChildren().add(new Button("Find a turkey with its babies"));
        hbox.getChildren().add(new Button("Enjoy crisp and cool swimming in the somewhat crowded spring"));
        hbox.getChildren().add(new Button("Have eldest, who complained all night while camping, say he enjoyed the trip"));

        return hbox;
    }

    private VBox getTitleVBox(){
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);
        Text title = new Text("Welcome to choose your own adventure: Florida camping with Kristen!");
        title.setFill(Color.GREEN);
        title.setFont(Font.font("Comic Sans", 25));
        Text subtitle = new Text("Make your own camping trip with the following properties:");
        subtitle.setFill(Color.GREEN);
        subtitle.setFont(Font.font("Comic Sans", 15));
        vbox.getChildren().add(title);
        vbox.getChildren().add(subtitle);

        return vbox;
    }


    private VBox getVBox(){
        VBox vbox = new VBox (15);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15, 5, 5, 5));
        vbox.getChildren().add(new Label("Nighttime fun!"));
        vbox.getChildren().add(getHBox1());
        vbox.getChildren().add(new Label("Daytime enjoyment!"));
        vbox.getChildren().add(getHBox2());
        vbox.getChildren().add(new Label("Actually Positive Experiences!"));
        vbox.getChildren().add(getHBox3());

        Label label = new Label("Chance of overall success (percentage marked in black)");
        label.setFont(Font.font("Comic Sans", FontWeight.BOLD, FontPosture.ITALIC, 20));

        vbox.getChildren().add(label);

        Circle pieChart = new Circle();
        pieChart.setRadius(50);
        pieChart.setStrokeWidth(2.0);
        pieChart.setStroke(Color.BLACK);
        pieChart.setFill(Color.WHITE);

        vbox.getChildren().add(pieChart);


        vbox.getChildren().addAll(new Label("Did you enjoy your camping trip? Will you hazard camping in Florida in July with two kids and a husband who doesn't love the outdoors as much as you again?"), new TextField(), new Button("Submit Answer"));

        vbox.getChildren().add(new ImageView(new Image("https://www.animatedimages.org/data/media/1039/animated-campsite-and-campground-image-0041.gif")));

        return vbox;
    }

    class CustomPane extends StackPane {

        public CustomPane(String title){
            getChildren().add(new Label(title));
            setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        }

    }
}
