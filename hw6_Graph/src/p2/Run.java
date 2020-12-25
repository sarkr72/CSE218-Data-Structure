package p2;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import p1.Book;
import p1.BookBag;

public class Run {
	public static void start() throws IOException {
		int nElems = 3000;
		int i = 0;
		String line = "|---------------------------------------------------------------|\n";
		String str = line + "|   Bags        |   Bubble Sort | Merge Sort    | Partition     |\n" + line;

//		stage.setTitle("Line Chart Sample");

		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Times");
		xAxis.setLabel("Number of Books");

		 LineChart lineChart = new LineChart<Number, Number>(xAxis, yAxis);

		lineChart.setTitle("Sorting");

		XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
		series1.setName("Bubble sort");
		XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
		series2.setName("Merge Sort");
		XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
		series3.setName("Partition");

		while (i < 6) {
			System.out.println("nElems is " + nElems);
			series1.getData().add(new XYChart.Data<>(0, 0));
			series2.getData().add(new XYChart.Data<>(0, 0));
			series3.getData().add(new XYChart.Data<>(0, 0));
			
			BookBag bg = Utilities.getBooks(nElems);
			long startBubble = System.currentTimeMillis();
			bg.bubbleSortByISBN();
			long endBubble = System.currentTimeMillis() - startBubble;
			series1.getData().add(new XYChart.Data<>(nElems, endBubble));

			long startMerg = System.currentTimeMillis();
			bg.mergeSort();
			long endMerg = System.currentTimeMillis() - startMerg;
			series2.getData().add(new XYChart.Data<>(nElems, endMerg));

			long startPart = System.currentTimeMillis();
			bg.partition("M");
			long endPart = System.currentTimeMillis() - startPart;
			series3.getData().add(new XYChart.Data<>(nElems, endPart));

			str += String.format("%1s%-15s%1s%-15s%1s%-15s%1s%-15s%1s%n%65s", "|", nElems, "|", endBubble, "|", endMerg,
					"|", endPart, "|", line);
			nElems = nElems + 3000;
			i++;
		}
		
		lineChart.getData().addAll(series1, series2, series3);
//		Scene scene = new Scene(lineChart, 800, 600);
//
//		stage.setScene(scene);
//		stage.show();
//		System.out.println(str);
//	PrintWriter pw = new PrintWriter("myData.txt");
//	pw.print(str);
//	pw.close();
	}
}
