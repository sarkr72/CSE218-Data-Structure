package p2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import p1.Book;
import p1.BookBag;
import javafx.scene.chart.*;
public class Controller implements Initializable{


    @FXML
    private LineChart<?, ?> lneChart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			getGraph();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    @SuppressWarnings("unchecked")
	public void getGraph() throws IOException {
    	int nElems = 3000;
		int i = 0;
		String line = "|---------------------------------------------------------------|\n";
		String str = line + "|   Bags        |   Bubble Sort | Merge Sort    | Partition     |\n" + line;

//		stage.setTitle("Line Chart Sample");

		x = new CategoryAxis();
		y = new NumberAxis();
		y.setLabel("Times");
		x.setLabel("Number of Books");

//		 lneChart = new LineChart<CategoryAxis, Number>(x, y);

		lneChart.setTitle("Sorting");

		XYChart.Series series1 = new XYChart.Series<>();
		series1.setName("Bubble sort");
		XYChart.Series series2 = new XYChart.Series<>();
		series2.setName("Merge Sort");
		XYChart.Series series3 = new XYChart.Series<>();
		series3.setName("Partition");

		series1.getData().add(new XYChart.Data<>((0+""), 0));
		series2.getData().add(new XYChart.Data<>((0+""), 0));
		series3.getData().add(new XYChart.Data<>((0+""), 0));
		
		while (i < 6) {
			System.out.println("nElems is " + nElems);
			
			BookBag<Book> bg = Utilities.getBooks(nElems);
			long startBubble = System.currentTimeMillis();
			bg.bubbleSortByISBN();
			long endBubble = System.currentTimeMillis() - startBubble;
			series1.getData().add(new XYChart.Data<>((nElems+""), endBubble));

			long startMerg = System.currentTimeMillis();
			bg.mergeSort();
			long endMerg = System.currentTimeMillis() - startMerg;
			series2.getData().add(new XYChart.Data<>((nElems+""), endMerg));

			long startPart = System.currentTimeMillis();
			bg.partition("M");
			long endPart = System.currentTimeMillis() - startPart;
			series3.getData().add(new XYChart.Data<>((nElems+""), endPart));

			str += String.format("%1s%-15s%1s%-15s%1s%-15s%1s%-15s%1s%n%65s", "|", nElems, "|", endBubble, "|", endMerg,
					"|", endPart, "|", line);
			nElems = nElems + 3000;
			i++;
		}
		lneChart.getData().addAll(series1, series2, series3);
    }
    
}
