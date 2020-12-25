package p2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import p1.Book;
import p1.BookBag;

public class Controller4 implements Initializable{

	
	 @FXML
	    private LineChart<?, ?> lineChart;

	    @FXML
	    private CategoryAxis x;

	    @FXML
	    private NumberAxis y;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
	    	int nElems = 3000;
			int increment = nElems;
			int i = 0;
			String line = "|-------------------------------------------------------------------------------|\n";
			String str = line + "|   Bags        |   Bubble Sort | Merge Sort    | Quick Sort     | worst QuickSort\n" + line;

//			stage.setTitle("Line Chart Sample");

//			y.setLabel("Times");
//			x.setLabel("Number of Books");

			lineChart.setTitle("Sorting");

			XYChart.Series series1 = new XYChart.Series<>();
			series1.setName("Bubble sort");
			XYChart.Series series2 = new XYChart.Series<>();
			series2.setName("Merge Sort");
			XYChart.Series series3 = new XYChart.Series<>();
			series3.setName("Quick Sort");
			XYChart.Series series4 = new XYChart.Series<>();
			series4.setName("Quick Sort Worst");

			Utilities.makeBooks();
			series1.getData().add(new XYChart.Data<>((0+""), 0));
			series2.getData().add(new XYChart.Data<>((0+""), 0));
			series3.getData().add(new XYChart.Data<>((0+""), 0));
			series4.getData().add(new XYChart.Data<>((0+""), 0));
			try {
			while (i < 6) {
				System.out.println("Number of books = " + nElems);
				
				BookBag<Book> bg;
				
					bg = Utilities.getBooks(nElems);
				

				BookBag<Book> copy = bg.shallowCopy();	
				long startBubble = System.currentTimeMillis();
				copy.bubbleSortByISBN();
				long endBubble = System.currentTimeMillis() - startBubble;
				series1.getData().add(new XYChart.Data<>((nElems+""), endBubble));
				
				 copy = bg.shallowCopy();
				long startMerg = System.currentTimeMillis();
				copy.mergeSort();
				long endMerg = (System.currentTimeMillis() - startMerg);
				series2.getData().add(new XYChart.Data<>((nElems+""), endMerg));
				
				copy = bg.shallowCopy();
				long startQuick = System.currentTimeMillis();
				copy.quickSort();
				long endQuick = System.currentTimeMillis() - startQuick;
				series3.getData().add(new XYChart.Data<>((nElems+""), endQuick));

				copy= copy.reverseCopy();
				long startQuickWorst = System.currentTimeMillis();
				copy.quickSort();
				long endQuickWorst = System.currentTimeMillis() - startQuickWorst;
				series4.getData().add(new XYChart.Data<>((nElems+""), endQuickWorst));
				
				str += String.format("%1s%-15s%1s%-15s%1s%-15s%1s%-15s%1s%-15s%1s%n%80s", "|", nElems, "|", endBubble, "|", endMerg,
						"|", endQuick, "|", endQuickWorst,"|", line);
				nElems += increment;
				i++;
			}} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			lineChart.getData().addAll(series1, series2, series3, series4);
//			Scene scene = new Scene(lineChart, 800, 600);

//			stage.setScene(scene);
//			stage.show();
			
			System.out.println(str);
		}
	    }

