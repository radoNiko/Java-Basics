import java.awt.Graphics;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.awt.*;
import java.awt.color.*;
import java.awt.geom.*;

import javax.swing.JPanel;
import javax.swing.*;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;


public class _10_Paint_a_House_as_SVG {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter number of points: ");
		int n = input.nextInt();
		input.nextLine();
		Point1[] points = new Point1[n];
		boolean check;
		
		for (int i = 0; i < n; i++) {
			points[i] = new Point1();
			System.out.printf("Enter X coord for the %d point: ",i);
			points[i].x = input.nextDouble();
			System.out.printf("Enter Y coord for the %d point: ",i);
			points[i].y = input.nextDouble();
			input.nextLine();
		}
		
		DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
		Document doc = domImpl.createDocument(null, "html", null);
		SVGGraphics2D svg = new SVGGraphics2D(doc);
	}
	
//	public void paintComponent(Graphics g) {
//		super.
//		this.setBackgroung();
//	}
}

